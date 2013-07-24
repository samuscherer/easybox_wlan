import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private JButton jBGenerate;
	public JLabel jErrorLabel;
	public JTextField jTFKey;
	private JLabel jLabelHead;
	public JTextField jTFMac;
	Calc calcclass = new Calc(this);

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridBagLayout thisLayout = new GridBagLayout();
			thisLayout.rowWeights = new double[] {0.1, 0.1, 0.1};
			thisLayout.rowHeights = new int[] {20, 7, 20};
			thisLayout.columnWeights = new double[] {0.1, 0.1, 0.1};
			thisLayout.columnWidths = new int[] {7, 7, 20};
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jBGenerate = new JButton();
				getContentPane().add(jBGenerate, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jBGenerate.setText("Generiere Key");
				jBGenerate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jBGenerate.actionPerformed, event="+evt);
						//jTFKey.setText("");
						jErrorLabel.setText("");
						calcclass.generateKey(jTFMac.getText());
						
					}
				});
			}
			{
				jTFMac = new JTextField();
				getContentPane().add(jTFMac, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jTFMac.setPreferredSize(new java.awt.Dimension(165, 23));
				jTFMac.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						System.out.println("jTFMac.keyPressed, event="+evt);
						if(evt.getKeyCode() == 10){
							//jTFKey.setText("");
							jErrorLabel.setText("");
							calcclass.generateKey(jTFMac.getText());
						}
					}
				});
			}
			{
				jLabelHead = new JLabel();
				getContentPane().add(jLabelHead, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jLabelHead.setText("EasyBox Keyberechnung");
			}
			{
				jErrorLabel = new JLabel();
				getContentPane().add(jErrorLabel, new GridBagConstraints(0, 2, 3, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jErrorLabel.setPreferredSize(new java.awt.Dimension(525, 15));
			}
			{
				jTFKey = new JTextField();
				getContentPane().add(jTFKey, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jTFKey.setPreferredSize(new java.awt.Dimension(121, 23));
				jTFKey.setEditable(false);
				jTFKey.setText("Key");
				jTFKey.setHorizontalAlignment(SwingConstants.CENTER);

			}
			pack();
			this.setSize(592, 227);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
