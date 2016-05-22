ABOUT ALAN:

Alan is a transformation engine written in java and developed for an university project in Software security. 
It allows realizing several transformations to an android application.
There is a fixed chain of transformations which can be enabled or disabled by the framework checkboxes.


HOW TO...:

In order to start the engine, You must run the Main.java class, so you can see the engine GUI. 
Next, You must add a folder containing the apk files to transform, clicking the "add apk" button.
After selected desired transformations, click the "Start" button to run the engine.

After you click "Start", the engine will create two folders named "signed" and "evaluated".
In the "signed" folder ther will be the apk transformed, instead, in the "evaluated" folder, you will find the
original apk, which have been processed.



------------------------------------------------------------------------

TRANSFORMATIONS CHAIN:

	
	Disassembling
		|
		V
	Changing Package Name
		|
		V
	Data Encoding
		|
		V
	Code Reordering
		|
		V
	Insert Junk Instruction NOP
		|
		V
	Insert Junk Instruction Branch
		|
		V
	Insert Junk Instruction Garbage
		|
		V
	Identifiers Renaming Package
		|
		V
	Identifiers Renaming Class
		|
		V
	Call Indirection
		|
		V
	Reassembling
		|
		V
	Repacking


------------------------------------------------------------------------


ALAN STRUCTURE:


	******************
	* user interface *
	******************
		|_______________________The text field handlers check the correct formatting of the
		|			inside text and the correct folder selection, before the
	**********************		engine can be started.
	* handlers of        *		The start button handler provides to start the engine.
	* interface elements *
	**********************
		|_______________________When you click start, depending to values of checkbox,
		|                       a .bat file will be created (transEngine.bat) by Java
	*********************           application. It is the file that will be run.
	*   .bat file       *
	* runtime generated *
	*********************
		|_______________________Inside, transEngine.bat contains the correct sequence
		|                       of calls to the lower level .bat files, which perform 
	***********************		each transformation.
	* .bat static files   * 
	* for each 	      *
	* transformation      *
	***********************
		|_______________________Each low level .bat file contains the call to the correct
		|                       .jar or .py script which perform the transformation.
	*************************
	* folders containing    *
	* java or python scripts*
	*************************


------------------------------------------------------------------------


DEVELOPERS:
	
	Agostino De Lucia - agostino.delucia@hotmail.it
	Michele Meninno - michele.meninno@gmail.com
	Pasquale Battista - pas.battista@gmail.com
	Raffaele Esposito - e_raffaele@alice.it
