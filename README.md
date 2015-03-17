Software and Network Security - A.Y. 2014-2015<br>
Department of Engineering, University of Sannio, Benevento, Italy<br>

Supervisors:<br>
Prof. Corrado Aaron Visaggio, email: <aaron.visaggio@gmail.com>,  web: http://www.aaronvisaggio.it/<br>
Francesco Mercaldo, email: <fmercaldo@gmail.com><br>
Developers:<br>
Agostino De Lucia, email: <agostino.delucia@hotmail.it><br>
Raffaele Esposito, email: <e_raffaele@alice.it><br>
Michele Meninno, email: <michele.meninno@gmail.com><br>
Pasquale Battista, email: <pas.battista@gmail.com><br>


# Android Malware Evaluating Tools
In order to accomplish a deep antimalwares' detection algorithms analysis, we developed two different tools, both coded in Java.<br><br>

The first tool, named Alan, through a simple UI, provides the application of eight different smali code transformations<br> 
(detailed informations about these transformations can be found into the paper attached with the project).<br>
This tool contains other two free tools (signapk, apktool) used to decompile and recompile an android<br>
application, providing  almost original resources of the application.<br>
The tool works on smali code, a human readable dalvik bytecode.<br>
The aim of these transformations is hiding a malicious behaviour of an application from static malware scanning techniques.
A transformed application can be submitted on the website <a href="www.virustotal.com">VirusTotal</a> where it can be analyzed by <b>57</b> well-known (free and paid) anti-malwares.<br><br>

In order to work on a large malaware data-set, we developed a second tool, composed basically of code
enabling an automatic upload of the android applications on virus-total, using his specific java API, storing
result analysis on a relational database (we provide the schema in the project).<br>
This tool provides a simple UI to select among several queries, presenting results on html files<br>
Everything is well-documented and ready to be improved for future works.<br>

If you are interested in the results of the study we've carried out analyzing how <b>57</b> antimalwares<br>
from <a href="www.virustotal.com">VirusTotal</a> perform against 5600 malwares, before and after the application of<br> obfuscating transformations, you can contact us.<br>


