/*
	Idea: The main method should be "empty" except for a few method calls which calls methods that "make the game
	work". Some that are required are "updates", "draws". Sometimes a few lines of code are needed to run
	fundamental processes such as the code to continue looping (event loop), clear the GUI between frames (if Java
	doesn't automatically do that), or add one to a frames int which keeps tracks of how many/which frame we are on.
*/

int frames = 0;
public static void main(String [] args){
	updates();
	draws();
	frames++;
};

/*
	Idea: The updates method is ONLY called in the event loop (main method in Java) and the updates method calls the
	update method for EVERYTHING (objects) that has an update method
*/

public void updates(){

	/*
	- arraylist named object1Array contains all object1's that currently exist.
	- more arraylists containing all objects of that type (each object has an arraylist it gets added to)
	- loop through each object array and update each of them.
	*/

	for(int i = 0; i < object1Array.length();i++){
		object1Array.update();
	};

	for(int i = 0; i < object2Array.length();i++){
		object2Array.update();
	};

	for(int i = 0; i < object3Array.length();i++){
		object3Array.update();
	};

};



/*
	Idea: The draws [SIDENOTE1] method is ONLY called in the event loop (main method in Java) and the updates method
	calls the update method for EVERYTHING (objects) that has an update method
*/

public void draws(){

	/*
	- arraylist named object1Array contains all object1's that currently exist.
	- more arraylists containing all objects of that type (each object has an arraylist it gets added to)
	- loop through each object array and draw each of them.
	*/

	for(int i = 0; i < object1Array.length();i++){
		object1Array.draw();
	};

	for(int i = 0; i < object2Array.length();i++){
		object2Array.draw();
	};

	for(int i = 0; i < object3Array.length();i++){
		object3Array.draw();
	};

};





/*
	How I recommend the overall code/script structure. (May vary slightly in Java)

	{ <--- start of file (not method or anything else)
		
		//	leave very first line in document blank. (not even a comment)
		

		//	global variables below

		//	global variables above


		//	"loose/free" methods below
			[SIDENOTE2]
		// "loose/free" methods above


		//	objects (if any) below

		//	objects (if any) above


		//	event loop method below

		//	event loop method above

		// leave at least one blank line at bottom of file

	} <--- end of file

*/





/*
	SIDENOTES:

		1:
			I recommend calling it "draws" instead of "render" because you have an "updates" method for the method "update"
			so keeping everything simple and sticking to a pattern really helps in preventing confusion. (In this case
			the pattern to keep is add an "s" to the end of the method that calls multiple of the same method)
		

		2.
			You may be wondering what I mean by "loose" or "free". These are terms that I came-up with to describe methods
			which are not apart of anything special. They aren't attached to any object and can be accessed at nearly (or all)
			of the time. An example of a "loose/free" method would be the following:

				public Color randomColor(redMin, redMax, greenMin, greenMax, blueMin, blueMax){
					Color color = new Color();

					int redValue = (int) ((Math.random() * redMax) + redMin);
					int greenValue = (int) ((Math.random() * greenMax) + greenMin);
					int blueValue = (int) ((Math.random() * blueMax) + blueMin);

					color.setRed(redValue);
					color.setGreen(greenValue);
					color.setBlue(blueValue);

					return color;
				};

			This is a method that is not attached to anything and should be available anywhere. (especially in the
			"draw" method of ALL objects) Not all "loose/free" methods are visual related. Sometimes it is just a
			method that has an equation and when given parameters it returns an answer.
		

		3.
			There are a few "rules" that are good to follow, but not required technically. They are just good
			practices to make your code/script more readable for others. (which is important when working in a
			group or club) Some of these (but not all) actually are technically better coding practices but it
			"doesn't really matter" if you know what I mean. Some examples are:

				-	use "i" as the variable name in a "generic loop". The "i" is actually short for "instance
					variable" which is what the int below is.
						Example:

						for(int i = 0;i < 10;i++){
							System.out.println("Hello World!");
						};

				-	close all loops and methods with a semi-colon. You can see examples of this in all the
					code/script I typed above.

				-	Include a space before AND after an operator/symbols. operator/symbols such as:
					+ - * / = && || != ^
					Including spaces in other places like between parameters (see above) or between type casts 
					(see above) also makes code/script easier to read and know whats going on.

				-	INCLUDE PROPER INDENTAION! Code/script gets very confusing when you don't indent correctly
					especially when you have loops in methods in classes in a larger class etc.

				- 	Skipping a line is OK. (see above) Leaving a line completely blank for no reason other than
					to visually divide some code/script is good. (skipped a line after I made the Color object
					and after I got all the RGB values and after I set them all.)

				-	I don't know why you would do this but when creating objects, don't mix methods and variables.
					Stay organized.
						Example:

						public class ObjectName{
							private int x;
							private int y;
							private int w;
							private int h;
							private Color color;

							public ObjectName(){
								x = 0;
								y = 0;
								w = 0;
								h = 0;
								color = rgb(0,0,0);
							};

							public ObjectName(int xCord, int yCord, int width, int height, Color c){
								x = xCord;
								y = yCord;
								w = width;
								h = height;
								color = c;
							};



							public int getX(){
								return x;
							}

							public int getY(){
								return y;
							}

							public int getWidth(){
								return w;
							};

							public int getHeight(){
								return h;
							};

							public Color getColor(){
								return color;
							};



							public int setX(int xCord){
								x = xCord;
							}

							public int setY(int yCord){
								y = yCord;
							}

							public int setWidth(int width){
								w = width;
							};

							public int setHeight(int height){
								h = height;
							};

							public Color setColor(Color color){
								color = c;
							};



							public void doSomething(){
								//insert code/script here to actually do something useful
								System.out.println("I did something...");
							};

						};


		4.
			One last thing, it has been over a year since I have coded/scripted Java so if I typed something
			wrong above or my mind was on Javascript mode and I typed the wrong language above and didn't
			notice then I'm sorry, but you get the idea right?
*/