/*
 * Inventory.java
 *
 * Created on May 12, 2008, 3:36 PM
 * Updated on 15 May 2008 ===== **NOTE: Changed from JPanel to JPane b/c of issues with visibility
 * Completed on 26 May 2008
 */


import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  kfryauff
 */
public class ViewInventory extends javax.swing.JFrame {

    /** Creates new form Inventory */
    public ViewInventory() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
    	/* GUI (initial components)     */

        infoPanel = new javax.swing.JPanel();
        innerInfoPanel = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        titlePanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        returnBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoPanel.setBackground(new java.awt.Color(204, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 3));

        innerInfoPanel.setBackground(new java.awt.Color(204, 255, 255));

        inventoryTable.setAutoCreateRowSorter(true);
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Size", "Color", "Gender", "Price", "Amount", "Description", "Condition", "Popularity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableScrollPanel.setViewportView(inventoryTable);

        javax.swing.GroupLayout innerInfoPanelLayout = new javax.swing.GroupLayout(innerInfoPanel);
        innerInfoPanel.setLayout(innerInfoPanelLayout);
        innerInfoPanelLayout.setHorizontalGroup(
            innerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                .addContainerGap())
        );
        innerInfoPanelLayout.setVerticalGroup(
            innerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(innerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        titlePanel.setBackground(new java.awt.Color(204, 255, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 3));

        titleLbl.setBackground(new java.awt.Color(204, 255, 255));
        titleLbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("VIEW INVENTORY");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        buttonPanel.setBackground(new java.awt.Color(204, 255, 255));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 3));

        returnBtn.setText("Back To Main");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        openBtn.setText("OPEN");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        printBtn.setText("PRINT PAGE");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(printBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(returnBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
/* returns to main Menu Frame 
 */
    this.setVisible(false);
    new mainM().setVisible(true);
}                                         

private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
/* exits the entire program 
 */
    WarningJDialog warning = new WarningJDialog(this, true);
    warning.printExitMessage("PROGRAM WILL NOW CLOSE... \n\n GOOD BYE!!", "CANCEL");
    warning.setVisible(true);
    System.exit(0);
}                                       

private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
/* Opens a jfileChooser in which the user may select a file to open
 * User must make sure that it is the right file, otherwise it will not load correctly
 * 	Correct File:
 * 		Text File w/ data saved previously by the Inventory (edit inventory) class
 */
    File file = MessageUtil.getPath(inventoryTable, MessageUtil.OPEN, MessageUtil.FILES_ONLY);
    if (file == null) {
        return;
    }
    BufferedReader input = null;
    try {
        input = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    String line;
    tableArray = new Object[1][9];
    rowNum = 0;
    int lineNum = 0;
    try {
        while ((line = input.readLine()) != null) {
            lineNum++;
            addRemoveRow(1);  //adds one row to tableArray (and to table)

            int start = 0;
            int end = line.indexOf("||", start);

            for (int i = 0; i < tableArray[0].length; i++) {
                String word = line.substring(start, end);
                System.out.println("row: " + rowNum + "  i: " + i + " word: " + word + " \t end: " + end + " tbl length: " + tableArray.length + ", " + tableArray[0].length);
                tableArray[rowNum - 1][i] = word.trim();
                start = end + 2;
                end = line.indexOf("||", start);
            }

        }
        input.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    drawNewTable();
}                                       

private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
/* Prints inventory table that is currently opened
 */  
    try {
        inventoryTable.print();                                        
    } catch (PrinterException ex) {
        Logger.getLogger(ViewInventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                        

    private void addRemoveRow(int x) {
    	/* Helper method that adds or removes (if x is negative) x number of rows from the end
    	 * of the table & array
    	 */
        Object[][] newTable = new Object[rowNum + x][9];
        int length = 0;
        if (x < 0) {
            length = newTable.length;
        } else {
            length = tableArray.length;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < tableArray[0].length; j++) {
                newTable[i][j] = tableArray[i][j];
            }
        }
        tableArray = newTable;
        drawNewTable();
        rowNum += x;
    }

    private void drawNewTable() {
    	/* re-draws the table with the new tableArray (a representative 2 dim Object array,
    	 * representing the table and storing it's values)
    	 */
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(tableArray,
                new String[]{
                    "Item Name", "Size", "Color", "Gender", "Price", "Amount", "Description", "Condition", "Popularity"
                }));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel innerInfoPanel;
    public static javax.swing.JTable inventoryTable;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration
    private int rowNum = 0;
    private Object[][] newTable;
    private Object[][] tableArray = new Object[][]{{null, null, null, null, null, null, null, null, null}};
}
