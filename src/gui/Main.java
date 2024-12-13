package gui;

import persistencia.ConexionBD;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import iconos.Implementacion;
import logica.Vehiculo;
import logica.VehiculoDAO;
        
public class Main extends javax.swing.JFrame {


    Implementacion icono = new Implementacion();
            
    public Main() {
        initComponents();
        // Iconos de Dashboard
        icono.escalarLabel(iconInicio, "/iconos/house.png");
        icono.escalarLabel(iconRegistro, "/iconos/clipboard .png");
        
        // Icono de Ventana
        setIconImage(new ImageIcon(getClass().getResource("/iconos/car.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTITULOCPARKING2 = new javax.swing.JLabel();
        JPBOTONINICIO = new javax.swing.JPanel();
        JLBOTONINICIO = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        JPBOTONREGISTRO = new javax.swing.JPanel();
        JLBOTONREGISTRO = new javax.swing.JLabel();
        iconRegistro = new javax.swing.JLabel();
        JPBOTONHISTORIAL = new javax.swing.JPanel();
        JLBOTONHISTORIAL = new javax.swing.JLabel();
        JPBOTONREPORTE = new javax.swing.JPanel();
        JLBOTONREPORTE = new javax.swing.JLabel();
        JPBOTONCONFIGURACION = new javax.swing.JPanel();
        JLBOTONCONFIGURACION = new javax.swing.JLabel();
        lblFondoMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPTABINTERFAZ = new javax.swing.JTabbedPane();
        JPINICIO = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBorde1 = new gui.PanelBorde();
        jLabel1 = new javax.swing.JLabel();
        panelBorde2 = new gui.PanelBorde();
        jLabel3 = new javax.swing.JLabel();
        panelBorde3 = new gui.PanelBorde();
        jLabel4 = new javax.swing.JLabel();
        panelBorde4 = new gui.PanelBorde();
        jLabel7 = new javax.swing.JLabel();
        JPREGISTRO = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPlacaEntrada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPlacaSalida = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cboxCategoria = new javax.swing.JComboBox<>();
        btnRegistrarSalida = new javax.swing.JButton();
        btnRegistrarEntrada1 = new javax.swing.JButton();
        lblPropietarioObligatorio = new javax.swing.JLabel();
        lblPlacaObligatorio = new javax.swing.JLabel();
        JPHISTORIAL = new javax.swing.JPanel();
        JLTITULOHISTORIAL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtBuscarPor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        JPREPORTE = new javax.swing.JPanel();
        panelBorde10 = new gui.PanelBorde();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        panelBorde11 = new gui.PanelBorde();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        JPCONFIGURACION = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtTarifaAuto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTarifaMoto = new javax.swing.JTextField();
        txtAforo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTITULOCPARKING2.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabelTITULOCPARKING2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTITULOCPARKING2.setText("CParking");
        jPanel1.add(jLabelTITULOCPARKING2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        JPBOTONINICIO.setBackground(new java.awt.Color(255, 255, 255));
        JPBOTONINICIO.setPreferredSize(new java.awt.Dimension(300, 60));
        JPBOTONINICIO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPBOTONINICIOMouseMoved(evt);
            }
        });
        JPBOTONINICIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBOTONINICIOMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBOTONINICIOMouseExited(evt);
            }
        });

        JLBOTONINICIO.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLBOTONINICIO.setForeground(new java.awt.Color(0, 0, 0));
        JLBOTONINICIO.setText("Inicio");

        javax.swing.GroupLayout JPBOTONINICIOLayout = new javax.swing.GroupLayout(JPBOTONINICIO);
        JPBOTONINICIO.setLayout(JPBOTONINICIOLayout);
        JPBOTONINICIOLayout.setHorizontalGroup(
            JPBOTONINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBOTONINICIOLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(iconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JLBOTONINICIO)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        JPBOTONINICIOLayout.setVerticalGroup(
            JPBOTONINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBOTONINICIOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBOTONINICIO, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JPBOTONINICIOLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(iconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(JPBOTONINICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        JPBOTONREGISTRO.setBackground(new java.awt.Color(255, 255, 255));
        JPBOTONREGISTRO.setPreferredSize(new java.awt.Dimension(300, 60));
        JPBOTONREGISTRO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPBOTONREGISTROMouseMoved(evt);
            }
        });
        JPBOTONREGISTRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBOTONREGISTROMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBOTONREGISTROMouseExited(evt);
            }
        });
        JPBOTONREGISTRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLBOTONREGISTRO.setBackground(new java.awt.Color(0, 0, 0));
        JLBOTONREGISTRO.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLBOTONREGISTRO.setForeground(new java.awt.Color(0, 0, 0));
        JLBOTONREGISTRO.setText("Registro");
        JPBOTONREGISTRO.add(JLBOTONREGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        iconRegistro.setPreferredSize(new java.awt.Dimension(24, 24));
        JPBOTONREGISTRO.add(iconRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jPanel1.add(JPBOTONREGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 50));

        JPBOTONHISTORIAL.setBackground(new java.awt.Color(255, 255, 255));
        JPBOTONHISTORIAL.setPreferredSize(new java.awt.Dimension(300, 60));
        JPBOTONHISTORIAL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPBOTONHISTORIALMouseMoved(evt);
            }
        });
        JPBOTONHISTORIAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBOTONHISTORIALMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBOTONHISTORIALMouseExited(evt);
            }
        });

        JLBOTONHISTORIAL.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLBOTONHISTORIAL.setForeground(new java.awt.Color(0, 0, 0));
        JLBOTONHISTORIAL.setText("Historial");

        javax.swing.GroupLayout JPBOTONHISTORIALLayout = new javax.swing.GroupLayout(JPBOTONHISTORIAL);
        JPBOTONHISTORIAL.setLayout(JPBOTONHISTORIALLayout);
        JPBOTONHISTORIALLayout.setHorizontalGroup(
            JPBOTONHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBOTONHISTORIALLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(JLBOTONHISTORIAL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPBOTONHISTORIALLayout.setVerticalGroup(
            JPBOTONHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBOTONHISTORIALLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBOTONHISTORIAL, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(JPBOTONHISTORIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        JPBOTONREPORTE.setBackground(new java.awt.Color(255, 255, 255));
        JPBOTONREPORTE.setPreferredSize(new java.awt.Dimension(300, 60));
        JPBOTONREPORTE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPBOTONREPORTEMouseMoved(evt);
            }
        });
        JPBOTONREPORTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBOTONREPORTEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBOTONREPORTEMouseExited(evt);
            }
        });

        JLBOTONREPORTE.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLBOTONREPORTE.setForeground(new java.awt.Color(0, 0, 0));
        JLBOTONREPORTE.setText("Reporte");

        javax.swing.GroupLayout JPBOTONREPORTELayout = new javax.swing.GroupLayout(JPBOTONREPORTE);
        JPBOTONREPORTE.setLayout(JPBOTONREPORTELayout);
        JPBOTONREPORTELayout.setHorizontalGroup(
            JPBOTONREPORTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBOTONREPORTELayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(JLBOTONREPORTE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        JPBOTONREPORTELayout.setVerticalGroup(
            JPBOTONREPORTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBOTONREPORTELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBOTONREPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(JPBOTONREPORTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        JPBOTONCONFIGURACION.setBackground(new java.awt.Color(255, 255, 255));
        JPBOTONCONFIGURACION.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JPBOTONCONFIGURACIONMouseMoved(evt);
            }
        });
        JPBOTONCONFIGURACION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBOTONCONFIGURACIONMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBOTONCONFIGURACIONMouseExited(evt);
            }
        });

        JLBOTONCONFIGURACION.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLBOTONCONFIGURACION.setForeground(new java.awt.Color(0, 0, 0));
        JLBOTONCONFIGURACION.setText("Configuración");

        javax.swing.GroupLayout JPBOTONCONFIGURACIONLayout = new javax.swing.GroupLayout(JPBOTONCONFIGURACION);
        JPBOTONCONFIGURACION.setLayout(JPBOTONCONFIGURACIONLayout);
        JPBOTONCONFIGURACIONLayout.setHorizontalGroup(
            JPBOTONCONFIGURACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBOTONCONFIGURACIONLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(JLBOTONCONFIGURACION)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        JPBOTONCONFIGURACIONLayout.setVerticalGroup(
            JPBOTONCONFIGURACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBOTONCONFIGURACIONLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBOTONCONFIGURACION, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(JPBOTONCONFIGURACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, -1, -1));

        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/fondoblanco.jpg"))); // NOI18N
        jPanel1.add(lblFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 800));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/AFONDOGRISFOFOFO.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(900, 104));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 20));

        JPINICIO.setBackground(new java.awt.Color(240, 240, 240));
        JPINICIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("¡Bienvenido a Control Parking!");
        JPINICIO.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Datos Generales");
        JPINICIO.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Datos Generales");
        JPINICIO.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 387, -1, -1));

        panelBorde1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde1.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde1.setRoundBottomLeft(25);
        panelBorde1.setRoundBottomRight(25);
        panelBorde1.setRoundTopLeft(25);
        panelBorde1.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText("Ingresos");

        javax.swing.GroupLayout panelBorde1Layout = new javax.swing.GroupLayout(panelBorde1);
        panelBorde1.setLayout(panelBorde1Layout);
        panelBorde1Layout.setHorizontalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panelBorde1Layout.setVerticalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        JPINICIO.add(panelBorde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        panelBorde2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde2.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde2.setRoundBottomLeft(25);
        panelBorde2.setRoundBottomRight(25);
        panelBorde2.setRoundTopLeft(25);
        panelBorde2.setRoundTopRight(25);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setText("Hoy");

        javax.swing.GroupLayout panelBorde2Layout = new javax.swing.GroupLayout(panelBorde2);
        panelBorde2.setLayout(panelBorde2Layout);
        panelBorde2Layout.setHorizontalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        JPINICIO.add(panelBorde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 171, -1, -1));

        panelBorde3.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde3.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde3.setRoundBottomLeft(25);
        panelBorde3.setRoundBottomRight(25);
        panelBorde3.setRoundTopLeft(25);
        panelBorde3.setRoundTopRight(25);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("Ultimo Registro");

        javax.swing.GroupLayout panelBorde3Layout = new javax.swing.GroupLayout(panelBorde3);
        panelBorde3.setLayout(panelBorde3Layout);
        panelBorde3Layout.setHorizontalGroup(
            panelBorde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelBorde3Layout.setVerticalGroup(
            panelBorde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        JPINICIO.add(panelBorde3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        panelBorde4.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde4.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde4.setRoundBottomLeft(25);
        panelBorde4.setRoundBottomRight(25);
        panelBorde4.setRoundTopLeft(25);
        panelBorde4.setRoundTopRight(25);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("Aforo");

        javax.swing.GroupLayout panelBorde4Layout = new javax.swing.GroupLayout(panelBorde4);
        panelBorde4.setLayout(panelBorde4Layout);
        panelBorde4Layout.setHorizontalGroup(
            panelBorde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        panelBorde4Layout.setVerticalGroup(
            panelBorde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        JPINICIO.add(panelBorde4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        JPTABINTERFAZ.addTab("tab1", JPINICIO);

        JPREGISTRO.setBackground(new java.awt.Color(240, 240, 240));
        JPREGISTRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Placa");
        JPREGISTRO.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        txtPlacaEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaEntrada.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPlacaEntrada.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaEntradaActionPerformed(evt);
            }
        });
        JPREGISTRO.add(txtPlacaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 280, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Propietario");
        JPREGISTRO.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        txtPropietario.setBackground(new java.awt.Color(255, 255, 255));
        txtPropietario.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPropietario.setForeground(new java.awt.Color(0, 0, 0));
        txtPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPropietarioActionPerformed(evt);
            }
        });
        JPREGISTRO.add(txtPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 280, 40));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Categoria");
        JPREGISTRO.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        JPREGISTRO.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 280, 40));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Marca");
        JPREGISTRO.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Modelo");
        JPREGISTRO.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        JPREGISTRO.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 280, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Registro de Salida");
        JPREGISTRO.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 710, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Placa");
        JPREGISTRO.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        txtPlacaSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaSalida.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPlacaSalida.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaSalidaActionPerformed(evt);
            }
        });
        JPREGISTRO.add(txtPlacaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 280, 40));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Registro de Entrada");
        JPREGISTRO.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 710, -1));

        cboxCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvil", "Motocicleta" }));
        cboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoriaActionPerformed(evt);
            }
        });
        JPREGISTRO.add(cboxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 280, 40));

        btnRegistrarSalida.setBackground(new java.awt.Color(243, 225, 122));
        btnRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarSalida.setForeground(new java.awt.Color(30, 30, 30));
        btnRegistrarSalida.setText("Registrar");
        btnRegistrarSalida.setBorderPainted(false);
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });
        JPREGISTRO.add(btnRegistrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 130, 40));

        btnRegistrarEntrada1.setBackground(new java.awt.Color(243, 225, 122));
        btnRegistrarEntrada1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarEntrada1.setForeground(new java.awt.Color(30, 30, 30));
        btnRegistrarEntrada1.setText("Registrar");
        btnRegistrarEntrada1.setBorderPainted(false);
        btnRegistrarEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntrada1ActionPerformed(evt);
            }
        });
        JPREGISTRO.add(btnRegistrarEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 130, 40));

        lblPropietarioObligatorio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPropietarioObligatorio.setForeground(new java.awt.Color(220, 0, 0));
        lblPropietarioObligatorio.setText("* Este campo es obligatorio");
        JPREGISTRO.add(lblPropietarioObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        lblPlacaObligatorio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPlacaObligatorio.setForeground(new java.awt.Color(220, 0, 0));
        lblPlacaObligatorio.setText("* Este campo es obligatorio");
        JPREGISTRO.add(lblPlacaObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        JPTABINTERFAZ.addTab("tab2", JPREGISTRO);

        JPHISTORIAL.setBackground(new java.awt.Color(240, 240, 240));

        JLTITULOHISTORIAL.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        JLTITULOHISTORIAL.setForeground(new java.awt.Color(0, 0, 0));
        JLTITULOHISTORIAL.setText("Historial de Registros");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Buscar por:");

        jComboBox1.setBackground(new java.awt.Color(243, 225, 122));
        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Propietario", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtBuscarPor.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarPor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtBuscarPor.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPorActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(243, 225, 122));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(30, 30, 30));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Propietario", "Categoria", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        javax.swing.GroupLayout JPHISTORIALLayout = new javax.swing.GroupLayout(JPHISTORIAL);
        JPHISTORIAL.setLayout(JPHISTORIALLayout);
        JPHISTORIALLayout.setHorizontalGroup(
            JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHISTORIALLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTITULOHISTORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPHISTORIALLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPHISTORIALLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscar)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        JPHISTORIALLayout.setVerticalGroup(
            JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHISTORIALLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTITULOHISTORIAL)
                .addGap(30, 30, 30)
                .addGroup(JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPHISTORIALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPHISTORIALLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        JPTABINTERFAZ.addTab("tab3", JPHISTORIAL);

        JPREPORTE.setBackground(new java.awt.Color(240, 240, 240));
        JPREPORTE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorde10.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde10.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde10.setRoundBottomLeft(25);
        panelBorde10.setRoundBottomRight(25);
        panelBorde10.setRoundTopLeft(25);
        panelBorde10.setRoundTopRight(25);

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(109, 109, 109));
        jLabel27.setText("Ganancias");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(109, 109, 109));
        jLabel28.setText("Mensuales");

        javax.swing.GroupLayout panelBorde10Layout = new javax.swing.GroupLayout(panelBorde10);
        panelBorde10.setLayout(panelBorde10Layout);
        panelBorde10Layout.setHorizontalGroup(
            panelBorde10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(panelBorde10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorde10Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );
        panelBorde10Layout.setVerticalGroup(
            panelBorde10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(panelBorde10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorde10Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel28)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        JPREPORTE.add(panelBorde10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        panelBorde11.setBackground(new java.awt.Color(255, 255, 255));
        panelBorde11.setPreferredSize(new java.awt.Dimension(367, 183));
        panelBorde11.setRoundBottomLeft(25);
        panelBorde11.setRoundBottomRight(25);
        panelBorde11.setRoundTopLeft(25);
        panelBorde11.setRoundTopRight(25);

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(109, 109, 109));
        jLabel29.setText("Ganancias");

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(109, 109, 109));
        jLabel30.setText("Diarias");

        javax.swing.GroupLayout panelBorde11Layout = new javax.swing.GroupLayout(panelBorde11);
        panelBorde11.setLayout(panelBorde11Layout);
        panelBorde11Layout.setHorizontalGroup(
            panelBorde11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel29)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(panelBorde11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorde11Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );
        panelBorde11Layout.setVerticalGroup(
            panelBorde11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(panelBorde11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorde11Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel30)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        JPREPORTE.add(panelBorde11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Reporte de Ganancias");
        JPREPORTE.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 710, -1));

        JPTABINTERFAZ.addTab("tab4", JPREPORTE);

        JPCONFIGURACION.setBackground(new java.awt.Color(240, 240, 240));
        JPCONFIGURACION.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Configuración de Parametros");
        JPCONFIGURACION.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 710, -1));

        txtTarifaAuto.setBackground(new java.awt.Color(255, 255, 255));
        txtTarifaAuto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTarifaAuto.setForeground(new java.awt.Color(0, 0, 0));
        txtTarifaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifaAutoActionPerformed(evt);
            }
        });
        JPCONFIGURACION.add(txtTarifaAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 280, 40));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Aforo");
        JPCONFIGURACION.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Tarifa por Hora(Autos)");
        JPCONFIGURACION.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Tarifa por Hora(Motocicleta)");
        JPCONFIGURACION.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtTarifaMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtTarifaMoto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTarifaMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtTarifaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifaMotoActionPerformed(evt);
            }
        });
        JPCONFIGURACION.add(txtTarifaMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 280, 40));

        txtAforo.setBackground(new java.awt.Color(255, 255, 255));
        txtAforo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAforo.setForeground(new java.awt.Color(0, 0, 0));
        txtAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAforoActionPerformed(evt);
            }
        });
        JPCONFIGURACION.add(txtAforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 280, 40));

        btnGuardar.setBackground(new java.awt.Color(243, 225, 122));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(30, 30, 30));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        JPCONFIGURACION.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 130, 40));

        JPTABINTERFAZ.addTab("tab5", JPCONFIGURACION);

        getContentPane().add(JPTABINTERFAZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, 900, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPBOTONINICIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONINICIOMouseClicked
    JPTABINTERFAZ.setSelectedIndex(0);
    
    }//GEN-LAST:event_JPBOTONINICIOMouseClicked

    private void JPBOTONREGISTROMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREGISTROMouseMoved
    JPBOTONREGISTRO.setBackground(new Color(243,225,122));
    }//GEN-LAST:event_JPBOTONREGISTROMouseMoved

    private void JPBOTONREGISTROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREGISTROMouseClicked

    JPTABINTERFAZ.setSelectedIndex(1);

    }//GEN-LAST:event_JPBOTONREGISTROMouseClicked

    private void JPBOTONREGISTROMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREGISTROMouseExited
    JPBOTONREGISTRO.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_JPBOTONREGISTROMouseExited

    private void JPBOTONHISTORIALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONHISTORIALMouseClicked
    JPTABINTERFAZ.setSelectedIndex(2);
    }//GEN-LAST:event_JPBOTONHISTORIALMouseClicked

    private void JPBOTONREPORTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREPORTEMouseClicked
     JPTABINTERFAZ.setSelectedIndex(3);
    }//GEN-LAST:event_JPBOTONREPORTEMouseClicked

    private void JPBOTONCONFIGURACIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONCONFIGURACIONMouseClicked
    JPTABINTERFAZ.setSelectedIndex(4);
    }//GEN-LAST:event_JPBOTONCONFIGURACIONMouseClicked

    private void JPBOTONINICIOMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONINICIOMouseMoved
    JPBOTONINICIO.setBackground(new Color(243,225,122));
    }//GEN-LAST:event_JPBOTONINICIOMouseMoved

    private void JPBOTONINICIOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONINICIOMouseExited
    JPBOTONINICIO.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_JPBOTONINICIOMouseExited

    private void JPBOTONHISTORIALMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONHISTORIALMouseMoved
    JPBOTONHISTORIAL.setBackground(new Color(243,225,122));
    }//GEN-LAST:event_JPBOTONHISTORIALMouseMoved

    private void JPBOTONHISTORIALMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONHISTORIALMouseExited
    JPBOTONHISTORIAL.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_JPBOTONHISTORIALMouseExited

    private void JPBOTONREPORTEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREPORTEMouseMoved
    JPBOTONREPORTE.setBackground(new Color(243,225,122));
    }//GEN-LAST:event_JPBOTONREPORTEMouseMoved

    private void JPBOTONREPORTEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONREPORTEMouseExited
    JPBOTONREPORTE.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_JPBOTONREPORTEMouseExited

    private void txtPlacaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaEntradaActionPerformed

    private void txtPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPropietarioActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtPlacaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaSalidaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPorActionPerformed

    private void JPBOTONCONFIGURACIONMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONCONFIGURACIONMouseMoved
    JPBOTONCONFIGURACION.setBackground(new Color(243,225,122));
    }//GEN-LAST:event_JPBOTONCONFIGURACIONMouseMoved

    private void JPBOTONCONFIGURACIONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBOTONCONFIGURACIONMouseExited
    JPBOTONREPORTE.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_JPBOTONCONFIGURACIONMouseExited

    private void txtTarifaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifaAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifaAutoActionPerformed

    private void txtTarifaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifaMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifaMotoActionPerformed

    private void cboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCategoriaActionPerformed

    private void txtAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAforoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegistrarEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntrada1ActionPerformed
       
        String placa = txtPlacaEntrada.getText();
        String propietario = txtPropietario.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String categoria = cboxCategoria.getSelectedItem().toString();

        if (placa.isEmpty() || propietario.isEmpty() || marca.isEmpty() || modelo.isEmpty() || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Vehiculo vehiculo = new Vehiculo(placa, propietario, marca, modelo, categoria);
        VehiculoDAO vehiculoDAO = new VehiculoDAO();

        if (vehiculoDAO.registrarVehiculo(vehiculo)) {
            JOptionPane.showMessageDialog(this, "Vehículo registrado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarFormulario() {
        txtPlacaEntrada.setText("");
        txtPropietario.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        cboxCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrarEntrada1ActionPerformed

    
    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
  
        String placa = txtPlacaSalida.getText().trim();
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ConexionBD.obtenerConexion();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBOTONCONFIGURACION;
    private javax.swing.JLabel JLBOTONHISTORIAL;
    private javax.swing.JLabel JLBOTONINICIO;
    private javax.swing.JLabel JLBOTONREGISTRO;
    private javax.swing.JLabel JLBOTONREPORTE;
    private javax.swing.JLabel JLTITULOHISTORIAL;
    private javax.swing.JPanel JPBOTONCONFIGURACION;
    private javax.swing.JPanel JPBOTONHISTORIAL;
    private javax.swing.JPanel JPBOTONINICIO;
    private javax.swing.JPanel JPBOTONREGISTRO;
    private javax.swing.JPanel JPBOTONREPORTE;
    private javax.swing.JPanel JPCONFIGURACION;
    private javax.swing.JPanel JPHISTORIAL;
    private javax.swing.JPanel JPINICIO;
    private javax.swing.JPanel JPREGISTRO;
    private javax.swing.JPanel JPREPORTE;
    private javax.swing.JTabbedPane JPTABINTERFAZ;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrarEntrada1;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JComboBox<String> cboxCategoria;
    private javax.swing.JLabel iconInicio;
    private javax.swing.JLabel iconRegistro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTITULOCPARKING2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblPlacaObligatorio;
    private javax.swing.JLabel lblPropietarioObligatorio;
    private gui.PanelBorde panelBorde1;
    private gui.PanelBorde panelBorde10;
    private gui.PanelBorde panelBorde11;
    private gui.PanelBorde panelBorde2;
    private gui.PanelBorde panelBorde3;
    private gui.PanelBorde panelBorde4;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtBuscarPor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlacaEntrada;
    private javax.swing.JTextField txtPlacaSalida;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtTarifaAuto;
    private javax.swing.JTextField txtTarifaMoto;
    // End of variables declaration//GEN-END:variables
}
