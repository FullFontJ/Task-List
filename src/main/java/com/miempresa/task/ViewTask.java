package com.miempresa.task;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
/**
 *
 * @author fullfontJ
 */
public class ViewTask extends javax.swing.JPanel {
    List<ListTask> tasks = DataTask.obtenerUsuarios();
 
    /**
     * Creates new form ViewTask
     */
    public ViewTask() {
        initComponents();
//        BajarEstadoTask.setIcon(setIcono("/src/main/java/com/miempresa/task/image/flecha-izquierda.png",35));
//        SubirEstadoTask.setIcon(setIcono("/src/main/java/com/miempresa/task/image/flecha-derecha.png",35));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nuevo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ElemsNuevo = new javax.swing.JPanel();
        Proceso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ElemsProgreso = new javax.swing.JPanel();
        Finalizado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ElemsFinal = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 3));

        Nuevo.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevas Tareas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ElemsNuevo.setBackground(new java.awt.Color(255, 153, 0));
        ElemsNuevo.setLayout(new javax.swing.BoxLayout(ElemsNuevo, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout NuevoLayout = new javax.swing.GroupLayout(Nuevo);
        Nuevo.setLayout(NuevoLayout);
        NuevoLayout.setHorizontalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(ElemsNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NuevoLayout.setVerticalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ElemsNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Nuevo);

        Proceso.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("En Progreso");
        jLabel2.setToolTipText("");

        ElemsProgreso.setBackground(new java.awt.Color(153, 255, 153));
        ElemsProgreso.setLayout(new javax.swing.BoxLayout(ElemsProgreso, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout ProcesoLayout = new javax.swing.GroupLayout(Proceso);
        Proceso.setLayout(ProcesoLayout);
        ProcesoLayout.setHorizontalGroup(
            ProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(ElemsProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProcesoLayout.setVerticalGroup(
            ProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcesoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ElemsProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Proceso);

        Finalizado.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Finalizado");

        ElemsFinal.setBackground(new java.awt.Color(0, 255, 255));
        ElemsFinal.setLayout(new javax.swing.BoxLayout(ElemsFinal, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout FinalizadoLayout = new javax.swing.GroupLayout(Finalizado);
        Finalizado.setLayout(FinalizadoLayout);
        FinalizadoLayout.setHorizontalGroup(
            FinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(ElemsFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FinalizadoLayout.setVerticalGroup(
            FinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalizadoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ElemsFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Finalizado);
    }// </editor-fold>//GEN-END:initComponents

    
    private void SubirEstadoTaskActionPerformed(java.awt.event.ActionEvent evt) {                                                
        estadoTaskEdit(evt, true);
    }                                               

    private void BajarEstadoTaskActionPerformed(java.awt.event.ActionEvent evt) {                                                
        estadoTaskEdit(evt, false);
    }                                               
    
    
    
    public Icon setIcono(String url, int sizeImage){
        File imageFile = new File((System.getProperty("user.dir") +""+ url));
        ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
        Image image = icon.getImage().getScaledInstance(sizeImage, sizeImage, Image.SCALE_SMOOTH);
        icon.setImage(image);
        
        return icon;
    }
    
     
    private void ActualizarData(){
        ElemsNuevo.removeAll();
        ElemsNuevo.revalidate();
        ElemsNuevo.repaint();
        ElemsProgreso.removeAll();
        ElemsProgreso.revalidate();
        ElemsProgreso.repaint();
        ElemsFinal.removeAll();
        ElemsFinal.revalidate();
        ElemsFinal.repaint();
        
        
        if(!tasks.isEmpty()){
            for (int i = 0; i < tasks.size(); i++){

            ListTask onetask = tasks.get(i);
            JPanel panelTask = new JPanel();
//            panelTask.add(new JLabel(onetask.getTitulo()));
//            panelTask.add(new JLabel(onetask.getDescripcion()));
            JLabel title = new JLabel();
            title.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
            title.setText(onetask.getTitulo());
//            JLabel descripcion = new JLabel();
//            descripcion.setText(onetask.getDescripcion());
            JTextPane descripcionTextPanel = new JTextPane();
            JScrollPane panelDescripcion = new JScrollPane(descripcionTextPanel);
            panelDescripcion.setAutoscrolls(true);
            panelDescripcion.setEnabled(false);
            
            descripcionTextPanel.setMaximumSize(new Dimension(400, 400)); 
             descripcionTextPanel.setMinimumSize(new Dimension(200, 30));
            descripcionTextPanel.setPreferredSize(new Dimension(240, 50)); // Establecer un tamaño preferido
            panelDescripcion.setMinimumSize(new Dimension(62, 20));
            panelDescripcion.setMaximumSize(new Dimension(400, 400)); 

            
            
            JButton subirEstadoTask = new JButton();
            JButton bajarEstadoTask = new JButton();

        descripcionTextPanel.setEditable(false);
        descripcionTextPanel.setBackground(new java.awt.Color(255, 255, 255));
        descripcionTextPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        descripcionTextPanel.setText(onetask.getDescripcion());
        
        
        descripcionTextPanel.setOpaque(false);
        panelDescripcion.setViewportView(descripcionTextPanel);
        
        
        bajarEstadoTask.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        subirEstadoTask.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        bajarEstadoTask.setMaximumSize(new java.awt.Dimension(592, 51));
        bajarEstadoTask.setMinimumSize(new java.awt.Dimension(592, 518));
        bajarEstadoTask.setPreferredSize(new java.awt.Dimension(518, 518));
        
        
        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(panelTask);
        panelTask.setLayout(jPanelTaskLayout);
        
        JLabel idTask = new JLabel();
        idTask.setText(Integer.toString(onetask.getTarea()));
            
        
        
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelDescripcion))
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idTask))
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addComponent(bajarEstadoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 390)
                .addComponent(subirEstadoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(title)
                .addComponent(idTask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subirEstadoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajarEstadoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );
            
        bajarEstadoTask.setIcon(setIcono("/src/main/java/com/miempresa/task/image/flecha-izquierda.png",30));
        subirEstadoTask.setIcon(setIcono("/src/main/java/com/miempresa/task/image/flecha-derecha.png",30));
           
        subirEstadoTask.addActionListener((java.awt.event.ActionEvent evt) -> {
            SubirEstadoTaskActionPerformed(evt);
            });
        
        bajarEstadoTask.addActionListener((java.awt.event.ActionEvent evt) -> {
            BajarEstadoTaskActionPerformed(evt);
            });

            
        switch (onetask.getEstado()) {
            case 1 -> {
                bajarEstadoTask.setVisible(false);
                subirEstadoTask.setBackground(new java.awt.Color(255, 153, 0));
                panelTask.setBackground(new java.awt.Color(255, 153, 0));
                panelTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 4));
                ElemsNuevo.add(panelTask);
            }
            case 2 -> {
                bajarEstadoTask.setBackground(new java.awt.Color(153,255,153));
                subirEstadoTask.setBackground(new java.awt.Color(153,255,153));
                panelTask.setBackground(new java.awt.Color(153,255,153));
                panelTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,255,0), 4));
                ElemsProgreso.add(panelTask);
            }
            case 3 -> {
                subirEstadoTask.setVisible(false);
                bajarEstadoTask.setBackground(new java.awt.Color(0,255,255));
                panelTask.setBackground(new java.awt.Color(0,255,255));
                panelTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,153,153), 4));
                ElemsFinal.add(panelTask);
            }
            default -> {
            }
        }
            
        }
        }
    
    }
    
     public void reload() {
         ActualizarData();
    }
    
   private void estadoTaskEdit(java.awt.event.ActionEvent evt, boolean subir) {                                                
        JButton button = (JButton) evt.getSource();
        Component parentComponent = button.getParent();
        if (parentComponent instanceof JPanel) {
            JPanel parentPanel = (JPanel) parentComponent;
             Component[] components = parentPanel.getComponents();
                for (Component component : components) {
                    if(component instanceof JLabel) {
                        JLabel label = (JLabel) component;
                        String labelText = label.getText();
                        if(isNumeric(labelText)){
                               int indice = Integer.parseInt(labelText)-1;
                               if (indice >= 0 && indice < tasks.size()) {
                               int newEstado;
                                ListTask editTask = tasks.get(indice);
                                if(subir){
                                    newEstado = editTask.getEstado()+1;
                                }else{
                                    newEstado = editTask.getEstado()-1;
                                }
                                editTask.setEstado(newEstado);
                                ActualizarData();
                                } 
                        }
                    }
                }
        }
    }
    
    public static boolean isNumeric(String text) {
        try {
            Integer.valueOf(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ElemsFinal;
    private javax.swing.JPanel ElemsNuevo;
    private javax.swing.JPanel ElemsProgreso;
    private javax.swing.JPanel Finalizado;
    private javax.swing.JPanel Nuevo;
    private javax.swing.JPanel Proceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
