import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

//questa classe gestisce l'evento di clik sul pulsante start, che da il via alle trasformazioni
public class GestorePulsanteStart implements ActionListener
{
	private JTextField apkPath;				//text field contenente il path dell'apk
	private JTextField packageName;			//text field contenente il nuovo package name
	private JCheckBox chPackageName;		// checkbox di selezione della trasformazione "change package name"
	private JCheckBox junkInstNOP;			// checkbox di selezione della trasformazione "insert junk instruction"
	private JCheckBox junkInstBranch;		// checkbox di selezione della trasformazione "insert junk instruction"
	private JCheckBox junkInstGarbage;		// checkbox di selezione della trasformazione "insert junk instruction"
	private JCheckBox dataEncoding;			// checkbox della trasformazione "data encoding"
	private JCheckBox codeReordering; 		// checkbox della trasformazione "code reordering"
	private JCheckBox idRenamingPackage;	// checkbox della trasformazione "identifier renaming package"
	private JCheckBox idRenamingClass;		// checkbox della trasformazione "identifier renaming class"
	private JCheckBox callIndirection; 		// checkbox della trasformazione "call indirection"
	private JButton startButton;
	
	//costruttore
	public GestorePulsanteStart(JTextField apkPath, JTextField packageName, JCheckBox chPackageName, 
								JCheckBox junkInstNOP, JCheckBox junkInstBranch, JCheckBox junkInstGarbage, 
								JCheckBox dataEncoding, JCheckBox codeReordering, JCheckBox idRenamingPackage, 
								JCheckBox idRenamingClass, JCheckBox callIndirection, JButton startButton)
	{
		this.apkPath=apkPath;
		this.packageName=packageName;
		this.chPackageName=chPackageName;
		this.junkInstNOP=junkInstNOP;
		this.junkInstBranch=junkInstBranch;
		this.junkInstGarbage=junkInstGarbage;
		this.dataEncoding=dataEncoding;
		this.codeReordering=codeReordering;
		this.idRenamingPackage=idRenamingPackage;
		this.idRenamingClass=idRenamingClass;
		this.callIndirection=callIndirection;
		this.startButton=startButton;
	}
	
	//al click del pulsante start viene lanciato un thread che si occupa della gestione dell'evento associato
	//questa scelta � dovuta al fatto che il codice che verr� eseguito contiene un'istruzione "waitfot()", che se richiamata dal main-thread sospenderebbe
	//l'utilizzo dell'interfaccia, impedendo di chiudere l'applicazione una volta cliccato il pulsante start
	public void actionPerformed(ActionEvent e) 
	{	
		ThreadPulsanteStart th=new ThreadPulsanteStart(this.apkPath,this.packageName,this.chPackageName,
														this.junkInstNOP,this.junkInstBranch,this.junkInstGarbage,
														this.dataEncoding,this.codeReordering,this.idRenamingPackage,
														this.idRenamingClass,this.callIndirection,this.startButton);
		th.start();
	}
}