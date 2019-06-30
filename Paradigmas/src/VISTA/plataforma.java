
package VISTA;
 //*********************************** ++++++++++++++++++++++++++++DECLARACION DE LIBRERIAS+++++++++++++++++++ *****************************************************

import MODELO.Arreglo_Mascota;
import MODELO.Arreglo_Propietario;
import MODELO.javaPDF;
import email.email;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import ventanas.Gatos;
import ventanas.Perros;
import ventanas.acerca_de;

//import ventanas.Resumen;

public class plataforma extends javax.swing.JFrame {
    
// Declarando las clases
//    Mascota objMas;
//    Propietario objPro;
Arreglo_Mascota             ArregloMas ;
Arreglo_Propietario         ArregloPro;// todos los REGISTROS
DefaultTableModel           Tabla_Mas,Tabla_Pro;   //--SE DECLARA UN MODELO PARA LA TABLA---

//--------------------------------------SE COLOCA LA CABECERA A LA TABLA------------------------------------------------
String[] cabecera={"N°","CÓDIGO","SERVICIO","FECHA","MÁSCOTA","EDAD(MM)","SEXO","PESO(kg)","ESPECIE","RAZA","ESTATURA","CONTEXTURA","OJOS","PELO"};//+++++++++COLUMNAS++++++
String[] cabecera1={"N°","CÓDIGO","REGISTRO","NOMBRE(S) DEL PROPIETARIO","APELLIDO PATERNO","APELLIDO MATERNO","TELEFONO","CORREO","DIRECCION"};   
//-------------------------------------SE GENERA UNA MATRIZ EN BLANCO PARA EL LLENADO DE LOS DATOS DEL REGISTRO------------------------------------------
String[][] data={};//+++++++++++FILAS+++++++
//   int NumRegistro;
     //para las columnas
 TableColumn  column = null;
 Arreglo_Mascota col; 
 Arreglo_Propietario pro;
//----------FIN------------FIN--------------FIN----------------FIN-------------FIN--------------FIN---------------  
  //CONSTRUCTOR
    public plataforma() {
    initComponents();
    this.setExtendedState(plataforma.NORMAL);
    setIconImage (new ImageIcon(getClass().getResource("/icon/29.png")).getImage()); 

        this.setLocationRelativeTo(null);//PONER AL CENTRO EL FORMULARIO
        Tabla_Mas=new DefaultTableModel(data,cabecera);  //------SE CARGA LOS DATOS A LA TABLA
        jtlbRegistro.setModel(Tabla_Mas);//En la tabla del formulario se copiaran todos los datos de mi Modelo_Tabla que hasta este momento es ABSTRACT     
         
        Tabla_Pro=new DefaultTableModel(data,cabecera1); 
        jtlbRegistro1.setModel(Tabla_Pro);

         //Creando los arreglos
 pro=new Arreglo_Propietario();        
 col=new Arreglo_Mascota();  
this.RecuperarDeBinario();//
this.ActualizarTabla();   //
CambiarTamañoColumnas();  //

this.RecuperarDeBinario1();//
this.ActualizarTabla1();   //
CambiarTamañoColumnas1();  //
LimpiarEntradas1();
LimpiarEntradas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSEXO = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jbtnElimiMas = new javax.swing.JButton();
        jbtnLimpiMas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtlbRegistro = new javax.swing.JTable();
        jbtnBusMas = new javax.swing.JButton();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jtxtMascota = new javax.swing.JTextField();
        jbtnAñadir_foto = new javax.swing.JButton();
        jtblImagen = new javax.swing.JLabel();
        jtxtEdad = new javax.swing.JTextField();
        jcbxEspecie = new javax.swing.JComboBox();
        jcbxRAZA = new javax.swing.JComboBox();
        jbtnActuMas = new javax.swing.JButton();
        jbtnRegMas = new javax.swing.JButton();
        jDCfecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        JrbHEMBRA = new javax.swing.JRadioButton();
        JrbMACHO = new javax.swing.JRadioButton();
        jbtnR_sexo = new javax.swing.JButton();
        jtxtSEXO = new javax.swing.JTextField();
        jtxtC_OJOS = new javax.swing.JTextField();
        jtxtPESO = new javax.swing.JTextField();
        jcbxEstatura = new javax.swing.JComboBox();
        jtxtC_PELO = new javax.swing.JTextField();
        jcbxOrdenMas = new javax.swing.JComboBox();
        jcbxContextura = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jtxtcodma = new javax.swing.JTextField();
        jcbxServicio = new javax.swing.JComboBox();
        jtxtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtResumen = new javax.swing.JButton();
        jtxtAnalisis = new javax.swing.JTextField();
        jtxtRadiografias = new javax.swing.JTextField();
        jtxtServicios = new javax.swing.JTextField();
        jtxtEcografias = new javax.swing.JTextField();
        jtxtDestartaje = new javax.swing.JTextField();
        jtxtBaños = new javax.swing.JTextField();
        jbtnGrafico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtCirugia = new javax.swing.JTextField();
        jcMousePanel4 = new jcMousePanel.jcMousePanel();
        jtxtcorreo = new javax.swing.JTextField();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jtxttelefono = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtCC = new javax.swing.JTextField();
        jtxtApeMA = new javax.swing.JTextField();
        jtxtNpropietario = new javax.swing.JTextField();
        jtxtApePA = new javax.swing.JTextField();
        jDCRegistro = new com.toedter.calendar.JDateChooser();
        jbtnLimpiPro = new javax.swing.JButton();
        jbtnElimiPro = new javax.swing.JButton();
        jbtnBusPro = new javax.swing.JButton();
        jbtnActuPro = new javax.swing.JButton();
        jbtnRegiPro = new javax.swing.JButton();
        jcbxOrdenaPro = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtlbRegistro1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcMousePanel5 = new jcMousePanel.jcMousePanel();
        jtxtAutor = new javax.swing.JTextField();
        jtxtTitulo = new javax.swing.JTextField();
        jtxaReporte = new javax.swing.JTextField();
        jtxtObs = new javax.swing.JTextField();
        jtxtAsunto = new javax.swing.JTextField();
        jbtnCrearDocumento = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxatResumen = new javax.swing.JTextArea();
        jbtnCrearCorreo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMItemR_Perros = new javax.swing.JMenuItem();
        jMItemR_Gatos = new javax.swing.JMenuItem();
        jMenuAplicativos = new javax.swing.JMenu();
        jMItemWord = new javax.swing.JMenuItem();
        jMItemPPT = new javax.swing.JMenuItem();
        jMItemExcell = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMItemCalculadora = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO  DE MÁSCOTAS");
        setIconImage(getIconImage());
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jcMousePanel1.setColor1(new java.awt.Color(0, 153, 153));
        jcMousePanel1.setColor2(new java.awt.Color(0, 153, 153));
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/mat.png"))); // NOI18N
        jcMousePanel1.setModo(2);
        jcMousePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnElimiMas.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnElimiMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ELIMINAR.png"))); // NOI18N
        jbtnElimiMas.setToolTipText("eliminar");
        jbtnElimiMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnElimiMasActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jbtnElimiMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 80));

        jbtnLimpiMas.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLimpiMas.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnLimpiMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LIMPIAR.png"))); // NOI18N
        jbtnLimpiMas.setToolTipText("limpiar");
        jbtnLimpiMas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 0), null));
        jbtnLimpiMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiMasActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jbtnLimpiMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 90));

        jtlbRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtlbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtlbRegistro);

        jcMousePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1250, 60));

        jbtnBusMas.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnBusMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BUSCAR.png"))); // NOI18N
        jbtnBusMas.setToolTipText("buscar");
        jbtnBusMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBusMasActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jbtnBusMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 80));

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Máscota", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jcMousePanel2.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/CHECK.png"))); // NOI18N
        jcMousePanel2.setModo(2);
        jcMousePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtMascota.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtMascota.setForeground(new java.awt.Color(0, 0, 255));
        jtxtMascota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMascota.setText("LUCAS");
        jtxtMascota.setToolTipText("");
        jtxtMascota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE  :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMascotaActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 370, 70));

        jbtnAñadir_foto.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAñadir_foto.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnAñadir_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        jbtnAñadir_foto.setText("INSERTAR FOTO");
        jbtnAñadir_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 255), null));
        jbtnAñadir_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAñadir_fotoActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jbtnAñadir_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 190, 80));

        jtblImagen.setBackground(new java.awt.Color(255, 255, 255));
        jtblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/perros.gif"))); // NOI18N
        jtblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 51), java.awt.Color.darkGray));
        jtblImagen.setMaximumSize(new java.awt.Dimension(2, 2));
        jtblImagen.setMinimumSize(new java.awt.Dimension(2, 2));
        jtblImagen.setPreferredSize(new java.awt.Dimension(2, 2));
        jcMousePanel2.add(jtblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 140, 170));

        jtxtEdad.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtEdad.setForeground(new java.awt.Color(0, 0, 255));
        jtxtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEdad.setText("1");
        jtxtEdad.setToolTipText("");
        jtxtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDAD (meses)  :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEdadActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, 70));

        jcbxEspecie.setBackground(new java.awt.Color(204, 255, 255));
        jcbxEspecie.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcbxEspecie.setForeground(new java.awt.Color(0, 0, 255));
        jcbxEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---SELECCIONAR---", "AVES", "GATO", "PERRO", "ROEDOR", "OTROS", " " }));
        jcbxEspecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxEspecieActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 70));

        jcbxRAZA.setBackground(new java.awt.Color(204, 255, 255));
        jcbxRAZA.setEditable(true);
        jcbxRAZA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbxRAZA.setForeground(new java.awt.Color(0, 0, 255));
        jcbxRAZA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raza :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxRAZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxRAZAActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxRAZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, 70));

        jbtnActuMas.setBackground(new java.awt.Color(255, 255, 255));
        jbtnActuMas.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnActuMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar (2).png"))); // NOI18N
        jbtnActuMas.setToolTipText("actualizar");
        jbtnActuMas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 255), null));
        jbtnActuMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActuMasActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jbtnActuMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 70, 60));

        jbtnRegMas.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegMas.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnRegMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/REGISTRAR.jpg"))); // NOI18N
        jbtnRegMas.setText("REGISTRAR");
        jbtnRegMas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 51), null));
        jbtnRegMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegMasActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jbtnRegMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, 120, 60));

        jDCfecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "FECHA DE CITA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 15))); // NOI18N
        jDCfecha.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcMousePanel2.add(jDCfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 180, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEXO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 15))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupoSEXO.add(JrbHEMBRA);
        JrbHEMBRA.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        JrbHEMBRA.setForeground(new java.awt.Color(255, 0, 0));
        JrbHEMBRA.setText("HEMBRA");
        JrbHEMBRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbHEMBRAActionPerformed(evt);
            }
        });
        jPanel1.add(JrbHEMBRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        grupoSEXO.add(JrbMACHO);
        JrbMACHO.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        JrbMACHO.setText("MACHO");
        JrbMACHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbMACHOActionPerformed(evt);
            }
        });
        jPanel1.add(JrbMACHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jbtnR_sexo.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jbtnR_sexo.setText("Aceptar");
        jbtnR_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnR_sexoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnR_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 30));

        jtxtSEXO.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtSEXO.setForeground(new java.awt.Color(0, 0, 204));
        jtxtSEXO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jtxtSEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 40));

        jcMousePanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 190, 140));

        jtxtC_OJOS.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jtxtC_OJOS.setForeground(new java.awt.Color(0, 0, 255));
        jtxtC_OJOS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtC_OJOS.setText("MARRONES");
        jtxtC_OJOS.setToolTipText("");
        jtxtC_OJOS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OJOS   :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtC_OJOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtC_OJOSActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtC_OJOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 210, 70));

        jtxtPESO.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtPESO.setForeground(new java.awt.Color(0, 0, 255));
        jtxtPESO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPESO.setText("40");
        jtxtPESO.setToolTipText("");
        jtxtPESO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PESO (KG):", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtPESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPESOActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtPESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 70));

        jcbxEstatura.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcbxEstatura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECCIONAR--", "Grande", "Mediano", "Pequeño" }));
        jcbxEstatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estatura :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxEstaturaActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 180, 70));

        jtxtC_PELO.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jtxtC_PELO.setForeground(new java.awt.Color(0, 0, 255));
        jtxtC_PELO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtC_PELO.setText("MARRON");
        jtxtC_PELO.setToolTipText("");
        jtxtC_PELO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PELO  :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtC_PELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtC_PELOActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtC_PELO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 210, 70));

        jcbxOrdenMas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jcbxOrdenMas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Código", "Especie", "Estatura", "Nombre de Máscota", "Color de Pelo", "Raza de Máscota", "Sexo de Máscota" }));
        jcbxOrdenMas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar por:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxOrdenMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxOrdenMasActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxOrdenMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 390, 70));

        jcbxContextura.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcbxContextura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECCIONAR--", "Espigado", "Gruesa", "Normal" }));
        jcbxContextura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contextura :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxContextura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxContexturaActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxContextura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 70));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TU MÁSCOTA");
        jcMousePanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 140, -1));

        jtxtcodma.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtcodma.setForeground(new java.awt.Color(0, 0, 255));
        jtxtcodma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtcodma.setText("1014187260");
        jtxtcodma.setToolTipText("");
        jtxtcodma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEDULA DE  PROPIETARIO :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtcodma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcodmaActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jtxtcodma, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 210, 70));

        jcbxServicio.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcbxServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECCIONAR--", "Análisis Clínicos", "Baños Medicados", "Cirugías ", "Destartaje Dental", "Ecografías", "Radiografías", " ", " ", " " }));
        jcbxServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxServicioActionPerformed(evt);
            }
        });
        jcMousePanel2.add(jcbxServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 190, 70));

        jtxtTotal.setEditable(false);
        jtxtTotal.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtTotal.setForeground(new java.awt.Color(0, 0, 255));
        jtxtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MASCOTAS :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });
        jtxtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtTotalKeyPressed(evt);
            }
        });
        jcMousePanel2.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 190, 70));

        jcMousePanel1.add(jcMousePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 1180, 320));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Derechos Reservados   2019 COPY RIGHT ® ");
        jcMousePanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, -1, 20));

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jLabel4.setText("POligran 2019");
        jcMousePanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jtxtResumen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtResumen.setText("Resumen");
        jtxtResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResumenActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jtxtResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, -1));

        jtxtAnalisis.setEditable(false);
        jtxtAnalisis.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtAnalisis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtAnalisis.setText("-------");
        jtxtAnalisis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANÁLISIS CLÍNICOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 160, 60));

        jtxtRadiografias.setEditable(false);
        jtxtRadiografias.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtRadiografias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtRadiografias.setText("-------");
        jtxtRadiografias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RADIOGRAFÍAS:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtRadiografias, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 140, 60));

        jtxtServicios.setEditable(false);
        jtxtServicios.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtServicios.setForeground(new java.awt.Color(204, 0, 0));
        jtxtServicios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtServicios.setText("------");
        jtxtServicios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVICIOS:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jtxtServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtServiciosActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jtxtServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 410, 170, 60));

        jtxtEcografias.setEditable(false);
        jtxtEcografias.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtEcografias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEcografias.setText("-------");
        jtxtEcografias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECOGRAFÍAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtEcografias, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 130, 60));

        jtxtDestartaje.setEditable(false);
        jtxtDestartaje.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtDestartaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDestartaje.setText("-------");
        jtxtDestartaje.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESTARTAJE DENTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtDestartaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 160, 60));

        jtxtBaños.setEditable(false);
        jtxtBaños.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtBaños.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBaños.setText("-------");
        jtxtBaños.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BAÑOS MEDICADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtBaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 150, 60));

        jbtnGrafico.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbtnGrafico.setText("Gráfico");
        jbtnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGraficoActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jbtnGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("-------------------------------------------------------------------------------------RESUMEN----------------------------------------------------------------------------------------------------------------------");
        jcMousePanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 390, 1080, -1));

        jtxtCirugia.setEditable(false);
        jtxtCirugia.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jtxtCirugia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCirugia.setText("-------");
        jtxtCirugia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIRUGÍAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 12))); // NOI18N
        jcMousePanel1.add(jtxtCirugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 150, 60));

        jTabbedPane2.addTab("MÁSCOTA", jcMousePanel1);

        jcMousePanel4.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/mat.png"))); // NOI18N
        jcMousePanel4.setModo(2);
        jcMousePanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtcorreo.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtcorreo.setForeground(new java.awt.Color(0, 0, 255));
        jtxtcorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtcorreo.setToolTipText("");
        jtxtcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO ELECTRÓNICO :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreoActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jtxtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 210, 70));

        jcMousePanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Detalles del Propietario", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jcMousePanel3.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/CHECK.png"))); // NOI18N
        jcMousePanel3.setModo(2);
        jcMousePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxttelefono.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxttelefono.setForeground(new java.awt.Color(0, 0, 255));
        jtxttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxttelefono.setText("222222");
        jtxttelefono.setToolTipText("");
        jtxttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELÉFONO  :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttelefonoActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 70));

        jtxtDireccion.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtDireccion.setForeground(new java.awt.Color(0, 0, 255));
        jtxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDireccion.setText("CALLE 12 # 15-21");
        jtxtDireccion.setToolTipText("");
        jtxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCIÓN  :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDireccionActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, 70));

        jtxtCC.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtCC.setForeground(new java.awt.Color(0, 0, 255));
        jtxtCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCC.setText("1014187260");
        jtxtCC.setToolTipText("");
        jtxtCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEDULA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCCActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 70));
        jtxtCC.getAccessibleContext().setAccessibleDescription("CEDULA");

        jtxtApeMA.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtApeMA.setForeground(new java.awt.Color(0, 0, 255));
        jtxtApeMA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtApeMA.setText("CASTRO");
        jtxtApeMA.setToolTipText("");
        jtxtApeMA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO  MATERNO :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtApeMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApeMAActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxtApeMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 260, 70));

        jtxtNpropietario.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtNpropietario.setForeground(new java.awt.Color(0, 0, 255));
        jtxtNpropietario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNpropietario.setText("JHON");
        jtxtNpropietario.setToolTipText("");
        jtxtNpropietario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtNpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNpropietarioActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxtNpropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 530, 70));

        jtxtApePA.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jtxtApePA.setForeground(new java.awt.Color(0, 0, 255));
        jtxtApePA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtApePA.setText("RIAÑO");
        jtxtApePA.setToolTipText("");
        jtxtApePA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO PATERNO :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jtxtApePA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApePAActionPerformed(evt);
            }
        });
        jcMousePanel3.add(jtxtApePA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, 70));

        jDCRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "FECHA DE REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 15))); // NOI18N
        jDCRegistro.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jcMousePanel3.add(jDCRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 180, 70));

        jcMousePanel4.add(jcMousePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 560, 330));

        jbtnLimpiPro.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLimpiPro.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnLimpiPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LIMPIAR.png"))); // NOI18N
        jbtnLimpiPro.setToolTipText("limpiar");
        jbtnLimpiPro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 0), null));
        jbtnLimpiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnLimpiPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 100));

        jbtnElimiPro.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnElimiPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ELIMINAR.png"))); // NOI18N
        jbtnElimiPro.setToolTipText("eliminar");
        jbtnElimiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnElimiProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnElimiPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 90));

        jbtnBusPro.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnBusPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BUSCAR.png"))); // NOI18N
        jbtnBusPro.setToolTipText("buscar");
        jbtnBusPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBusProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnBusPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 80));

        jbtnActuPro.setBackground(new java.awt.Color(255, 255, 255));
        jbtnActuPro.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnActuPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar (2).png"))); // NOI18N
        jbtnActuPro.setToolTipText("actualizar");
        jbtnActuPro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 255), null));
        jbtnActuPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActuProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnActuPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 70, 70));

        jbtnRegiPro.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegiPro.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jbtnRegiPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/REGISTRAR.jpg"))); // NOI18N
        jbtnRegiPro.setText("Registrar");
        jbtnRegiPro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 153, 51), null));
        jbtnRegiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegiProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnRegiPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 120, 70));

        jcbxOrdenaPro.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jcbxOrdenaPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Codigo", "Nombre de Propietario", "Apellido Paterno", "Apellido Materno" }));
        jcbxOrdenaPro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar por:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14))); // NOI18N
        jcbxOrdenaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxOrdenaProActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jcbxOrdenaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 200, 70));

        jtlbRegistro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtlbRegistro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtlbRegistro1);

        jcMousePanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1250, 110));

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jLabel5.setText("POLIGRAN 2019");
        jcMousePanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Derechos Reservados   2019 COPY RIGHT ® ");
        jcMousePanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, -1, 20));

        jcMousePanel5.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/REGISTRAR.jpg"))); // NOI18N
        jcMousePanel5.setModo(2);
        jcMousePanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtAutor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtAutor.setText("POLIGRAN 2019");
        jcMousePanel5.add(jtxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 20));

        jtxtTitulo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jtxtTitulo.setForeground(new java.awt.Color(0, 0, 204));
        jtxtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTitulo.setText("POLI VET");
        jtxtTitulo.setBorder(null);
        jcMousePanel5.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 10));

        jtxaReporte.setText("PDF REPORTE");
        jcMousePanel5.add(jtxaReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 10));

        jtxtObs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtObs.setText("PDF");
        jcMousePanel5.add(jtxtObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 48, 70, -1));

        jtxtAsunto.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jtxtAsunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtAsunto.setText("Servicios Poli Vet");
        jtxtAsunto.setToolTipText("");
        jtxtAsunto.setBorder(null);
        jtxtAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAsuntoActionPerformed(evt);
            }
        });
        jcMousePanel5.add(jtxtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 60, 10));

        jcMousePanel4.add(jcMousePanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 10, 0));

        jbtnCrearDocumento.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jbtnCrearDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PDF.png"))); // NOI18N
        jbtnCrearDocumento.setText("Crear Documento");
        jbtnCrearDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearDocumentoActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnCrearDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 400, 40));

        jTxatResumen.setColumns(20);
        jTxatResumen.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jTxatResumen.setRows(5);
        jTxatResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jScrollPane3.setViewportView(jTxatResumen);

        jcMousePanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 610, 210));

        jbtnCrearCorreo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbtnCrearCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        jbtnCrearCorreo.setText("Crear Correo");
        jbtnCrearCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearCorreoActionPerformed(evt);
            }
        });
        jcMousePanel4.add(jbtnCrearCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 210, 40));

        jTabbedPane2.addTab("PROPIETARIO", jcMousePanel4);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 530));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenuArchivo.setBackground(new java.awt.Color(204, 255, 204));
        jMenuArchivo.setBorder(null);
        jMenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivo.png"))); // NOI18N
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N

        jMItemR_Perros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMItemR_Perros.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jMItemR_Perros.setText("Razas de Perros");
        jMItemR_Perros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemR_PerrosActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMItemR_Perros);

        jMItemR_Gatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMItemR_Gatos.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jMItemR_Gatos.setText("Razas de Gatos");
        jMItemR_Gatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemR_GatosActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMItemR_Gatos);

        jMenuBar1.add(jMenuArchivo);

        jMenuAplicativos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAplicativos.setBorder(null);
        jMenuAplicativos.setForeground(new java.awt.Color(51, 51, 255));
        jMenuAplicativos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/aplicativos.png"))); // NOI18N
        jMenuAplicativos.setText("Aplicativos");
        jMenuAplicativos.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jMenuAplicativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAplicativosActionPerformed(evt);
            }
        });

        jMItemWord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMItemWord.setBackground(new java.awt.Color(204, 255, 255));
        jMItemWord.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jMItemWord.setForeground(new java.awt.Color(51, 51, 255));
        jMItemWord.setText("Word");
        jMItemWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemWordActionPerformed(evt);
            }
        });
        jMenuAplicativos.add(jMItemWord);

        jMItemPPT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMItemPPT.setBackground(new java.awt.Color(204, 255, 255));
        jMItemPPT.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jMItemPPT.setForeground(new java.awt.Color(255, 0, 0));
        jMItemPPT.setText("Powert Point");
        jMItemPPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemPPTActionPerformed(evt);
            }
        });
        jMenuAplicativos.add(jMItemPPT);

        jMItemExcell.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMItemExcell.setBackground(new java.awt.Color(204, 255, 255));
        jMItemExcell.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jMItemExcell.setForeground(new java.awt.Color(0, 102, 0));
        jMItemExcell.setText("Excel");
        jMItemExcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemExcellActionPerformed(evt);
            }
        });
        jMenuAplicativos.add(jMItemExcell);
        jMItemExcell.getAccessibleContext().setAccessibleName("EXCEL");

        jMenuAplicativos.add(jSeparator2);

        jMItemCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMItemCalculadora.setBackground(new java.awt.Color(204, 255, 255));
        jMItemCalculadora.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jMItemCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calculator.png"))); // NOI18N
        jMItemCalculadora.setText("Calculadora");
        jMItemCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemCalculadoraActionPerformed(evt);
            }
        });
        jMenuAplicativos.add(jMItemCalculadora);

        jMenuBar1.add(jMenuAplicativos);

        jMenuAyuda.setBackground(new java.awt.Color(204, 204, 204));
        jMenuAyuda.setBorder(null);
        jMenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ayuda.png"))); // NOI18N
        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N

        jMItemAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMItemAcercaDe.setFont(new java.awt.Font("Cambria", 3, 15)); // NOI18N
        jMItemAcercaDe.setForeground(new java.awt.Color(255, 0, 0));
        jMItemAcercaDe.setText("Acerca De");
        jMItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMItemAcercaDe);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAcercaDeActionPerformed
 new acerca_de().setVisible(true);
}//GEN-LAST:event_jMItemAcercaDeActionPerformed

    private void jbtnRegMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegMasActionPerformed
String campo;
campo= VerificarMascota();//llama al metodo de verificacion
if(campo.equals(""))
              {  
String cod=this.jtxtcodma.getText().toUpperCase();//cod
String nombre=this.jtxtMascota.getText().toUpperCase();//nombre de mascota
String serv =this.jcbxServicio.getSelectedItem().toString().toUpperCase();//servicio
double edad=Double.parseDouble(this.jtxtEdad.getText().toUpperCase());//edad
String sexo=this.jtxtSEXO.getText().toUpperCase();//sexo
double peso=Double.parseDouble(this.jtxtPESO.getText().toUpperCase());//peso
String especie=this. jcbxEspecie.getSelectedItem().toString().toUpperCase();//especie  
String raza=this.jcbxRAZA.getSelectedItem().toString().toUpperCase();//raza
String estatura=this.jcbxEstatura.getSelectedItem().toString().toUpperCase();//estatura
String contextura=this.jcbxContextura.getSelectedItem().toString().toUpperCase();//contextura
String ojos=this.jtxtC_OJOS.getText().toUpperCase();//color de ojos
String pelo=this.jtxtC_PELO.getText().toUpperCase();//color de pelo
Date consulta=this.jDCfecha.getDate();//fecha de cita 
Icon foto=this.jtblImagen.getIcon();//foto de mascota

Mascota x = new Mascota(cod,serv,consulta,nombre,edad,sexo,peso,especie,
                          raza,estatura,contextura,ojos,pelo,foto);//guardar datos en el arreglo
         this.jTxatResumen.append("\n");//mostrar los datos en el area de texto del formulario PROPIETARIO  
         this.jTxatResumen.append("===========================DATOS DE MÁSCOTA============================"+ "\n");
         this.jTxatResumen.append("SERVICIO              : "+x.servicio+"\n\n");
         this.jTxatResumen.append("FECHA DE SERVICIO     : "+x.consulta+"\n\n"); 
         this.jTxatResumen.append("NOMBRE MÁSCOTA        : "+x.n_mascota+"\n\n"); 
         this.jTxatResumen.append("EDAD *MES(ES)*        : "+x.edad+"\n\n"); 
         this.jTxatResumen.append("SEXO                  : "+x.sexo+"\n\n"); 
         this.jTxatResumen.append("PESO (kg.)            : "+x.peso+"\n\n");
         this.jTxatResumen.append("ESPECIE               : "+x.especie+"\n\n");
         this.jTxatResumen.append("RAZA                  : "+x.raza+"\n\n"); 
         this.jTxatResumen.append("ESTATURA              : "+x.estatura+"\n\n");
         this.jTxatResumen.append("CONTEXTURA            : "+x.contextura+"\n\n"); 
         
     if (col.BuscarObj(x.getCodigo())!=-1)//se verifica si el codigo no es repetido
     JOptionPane.showMessageDialog(null,"CÓDIGO REPETIDO  " +campo);   
	else			
        { col.AgrgarObj(x);//sino se agregan los datos guardados en el arreglo x
     int i;      
      i= JOptionPane.showConfirmDialog(null,"¿Estas seguro de guardar el registro?","",
      JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
      if(i==0); //pide la confirmacion para seguir con el proceso
      InsertareEnTabla(x, col.NumObj()); //se insertan los datos en la tabla
      this.GrabarEnBinario();//se graba en binario
      LimpiarEntradas();//limpia las entradas del formulario
      ActualizarTabla();//actualiza la tabla       
      }    
      } //de lo contrario llama al metodo para ingresar datos correctos
      else JOptionPane.showMessageDialog(null, "VERIFIQUE LOS DATOS : * " +campo); 
    }//GEN-LAST:event_jbtnRegMasActionPerformed
//-----------------------------MÉTODO PARA VERIFICAR LA INFORMACION DEL FORMULARIO MASCOTA-----------------------------------
    String  VerificarMascota(){
if(this.jtxtMascota.getText().equals(""))
   { return"INGRESAR NOMBRE DE MÁSCOTA";}
if(this.jtxtEdad.getText().equals("")
  ||Double.parseDouble(this.jtxtEdad.getText())>=120.0||Double.parseDouble(this.jtxtEdad.getText())<=0.0)
   { return"INGRESAR LA EDAD CORRECTA";}
if(this.jtxtSEXO.getText().equals(""))
   { return"SELECCIONE UNA OPCIÓN DE SEXO";}
if(this.jtxtPESO.getText().equals("")
  ||Double.parseDouble(this.jtxtPESO.getText())>=120.0||Double.parseDouble(this.jtxtPESO.getText())<=0.0)
   { return"INGRESE EL PESO CORRECTO";}
if(this.jcbxEspecie.getSelectedIndex()==0)
    { return"SELECCIONAR ESPECIE";}
if(this.jcbxRAZA.getSelectedIndex()==0)
    { return"SELECCIONAR RAZA";}
if(this.jcbxEstatura.getSelectedIndex()==0)
    { return"SELECCIONAR ESTATURA";}
if(this.jtxtC_OJOS.getText().equals(""))
   { return"INGRESE EL COLOR DE OJOS";}
if(this.jcbxContextura.getSelectedIndex()==0)
    { return"SELECCIONAR CONTEXTURA";}
if(this.jtxtC_PELO.getText().equals(""))
   { return"INGRESE EL COLOR DE PELO";}
if(this.jDCfecha.getDate()==null)
   { return"INGRESAR FECHA DE CITA";}
if(this.jtxtcodma.getText().equals("")
   ||Integer.parseInt(this.jtxtcodma.getText())>=99999999||Integer.parseInt(this.jtxtcodma.getText())<=0)
   { return"INGRESAR CEDULA";}
if(this.jcbxServicio.getSelectedIndex()==0)
    { return"SELECCIONAR SERVICIO";}

  return"";
}
    
    
 //--------------------------METODO PARA VERIFICAR LA INFORMACION DEL FORMULARIO PROPIETARIO---------------------------------   
    String  VerificarPropietario(){
if(this.jtxtNpropietario.getText().equals(""))
   { return"INGRESAR NOMBRE DEL PROPIETARIO";}
if(this.jtxtApePA.getText().equals(""))
   { return"INGRESAR APELLIDO PATERNO";}
if(this.jtxtApeMA.getText().equals(""))
   { return"INGRESAR APELLIDO MATERNO";}
if(this.jtxtDireccion.getText().equals(""))
   { return"INGRESAR DIRECCION";}
if(this.jtxtCC.getText().equals("")
   ||Double.valueOf(this.jtxtCC.getText())>=999999999||Double.valueOf(this.jtxtCC.getText())<=0)
   { return"INGRESAR EL CEDULA";}
if(this.jtxttelefono.getText().equals(""))
   { return"INGRESAR EL TELÉFONO";}
if(this.jDCRegistro.getDate()==null)
   { return"INGRESAR FECHA DE REGISTRO";}
if(this.jtxtcorreo.getText().equals(""))
   { return"INGRESAR EL CORREO";}
  return"";
}   
    private void jbtnLimpiMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiMasActionPerformed
//        LIMPIAR LAS CASILLAS DE LA VENTANA MASCOTA
      int i;      
      i= JOptionPane.showConfirmDialog
      (null,"¿Estás seguro de Limpiar el Registro  ?",
      "",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
      if(i==0) 
      LimpiarEntradas();
    }//GEN-LAST:event_jbtnLimpiMasActionPerformed

    private void jbtnActuMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActuMasActionPerformed
 if(this.jtxtcodma.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"SELCCIONE EL BOTON DE BUSQUEDA!!");
      }
    else  {     
LimpiarEntradas1();//se limpian los campos del formulario PROPIETARIO
String campo;

campo= VerificarMascota();//Se llama al metodo de verificacion del formulario MASCOTA
if(campo.equals(""))
              {
     String cod=this.jtxtcodma.getText();//se cargan los datos del campo codigo 
     int posMas=col.BuscarObj(cod);//se busca los datos relacionados con el codigo seleccionado
//genero el nuevo objeto actualizado
String nombre=this.jtxtMascota.getText().toUpperCase();//nombre
double edad=Double.parseDouble(this.jtxtEdad.getText().toUpperCase());//edad
String serv =this.jcbxServicio.getSelectedItem().toString().toUpperCase();//servicio
String sexo=this.jtxtSEXO.getText().toUpperCase();//sexo
double peso=Double.parseDouble(this.jtxtPESO.getText().toUpperCase());//peso
String especie=this. jcbxEspecie.getSelectedItem().toString().toUpperCase();//especie  
String raza=this.jcbxRAZA.getSelectedItem().toString().toUpperCase();//raza
String estatura=this.jcbxEstatura.getSelectedItem().toString().toUpperCase();//estatura
String contextura=this.jcbxContextura.getSelectedItem().toString().toUpperCase();//contextura
String ojos=this.jtxtC_OJOS.getText().toUpperCase();//color de ojos
String pelo=this.jtxtC_PELO.getText().toUpperCase();//color de pelo
Date consulta=this.jDCfecha.getDate();//fecha de consulta 
Icon foto=this.jtblImagen.getIcon();//foto de mascota
   //CREAMOS EL OBJETO
Mascota actualizado=new Mascota(cod,serv,consulta,nombre,edad,sexo,peso,especie,
                                   raza,estatura,contextura,ojos,pelo,foto);//datos actualizados
  this.jTxatResumen.append("\n");//se muestran los datos en el area de texto del formulario PROPIETARIO  
         this.jTxatResumen.append("============================DATOS DE MÁSCOTA============================"+ "\n");
         this.jTxatResumen.append("SERVICIO              : "+actualizado.servicio+"\n\n");
         this.jTxatResumen.append("FECHA DE SERVICIO     : "+actualizado.consulta+"\n\n"); 
         this.jTxatResumen.append("NOMBRE MÁSCOTA        : "+actualizado.n_mascota+"\n\n"); 
         this.jTxatResumen.append("EDAD *MES(ES)*        : "+actualizado.edad+"\n\n"); 
         this.jTxatResumen.append("SEXO                  : "+actualizado.sexo+"\n\n"); 
         this.jTxatResumen.append("PESO (kg.)            : "+actualizado.peso+"\n\n");
         this.jTxatResumen.append("ESPECIE               : "+actualizado.especie+"\n\n");
         this.jTxatResumen.append("RAZA                  : "+actualizado.raza+"\n\n"); 
         this.jTxatResumen.append("ESTATURA              : "+actualizado.estatura+"\n\n");
         this.jTxatResumen.append("CONTEXTURA            : "+actualizado.contextura+"\n\n"); 

   //actualizar
 col.ActualizarObj(posMas,actualizado);//Se actualizan los datos en el arreglo mascota
 int i;      
      i= JOptionPane.showConfirmDialog(null,"¿Estas seguro de guardar el registro?","",
         JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
      if(i==0);//se pide confirmacion para guardar el registro
 this.GrabarEnBinario();//luego de la confirmacion se guardaran los datos en binario
 this.ActualizarTabla();//se actualiza el registro seleccionado de la tabla MASCOTA
 this.LimpiarEntradas();
    } //en caso de no estar los datos debidamente llenados se pide la correcccion de los mismos

 else JOptionPane.showMessageDialog(null, "VERIFIQUE LOS DATOS : * " +campo); }
    }//GEN-LAST:event_jbtnActuMasActionPerformed

    private void jbtnBusMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBusMasActionPerformed
    //lectura del codigo de la mascota  a consultar
        String cod=JOptionPane.showInputDialog
        ("Ingrese el Código de la Máscota a consultar");
        //determinar si el codigo existe o no
        if(col.BuscarObj(cod)==-1){
           JOptionPane.showMessageDialog
        (null,"Código de Máscota no Existe");  
        }
        else{
       JOptionPane.showMessageDialog(null,"Código de Máscota"
         + " Existe y esta en la posicion : "+col.BuscarObj(cod)); 
   
 //RECUPERANDO LOS DATOS EN EL FORMULARIO MASCOTA
            int posFound = col.BuscarObj(cod); 
this.jtxtcodma.setText(col.RecuperarObj(posFound).getCodigo());//codigo
this.jtxtMascota.setText(col.RecuperarObj(posFound).getN_mascota());//nombre
this.jcbxServicio.setSelectedItem(col.RecuperarObj(posFound).getServicio().toString());//servicio  
this.jtxtEdad.setText(String.valueOf(col.RecuperarObj(posFound).edad));//edad  
this.jtxtSEXO.setText(col.RecuperarObj(posFound).getSexo());//sexo   
this.jtxtPESO.setText(String.valueOf(col.RecuperarObj(posFound).peso));//peso  
this.jcbxEspecie.setSelectedItem(col.RecuperarObj(posFound).getEspecie().toString());//especie  
this.jcbxRAZA.setSelectedItem(col.RecuperarObj(posFound).getRaza().toString());//raza  
this.jcbxEstatura.setSelectedItem(col.RecuperarObj(posFound).getEstatura().toString());//estatura  
this.jcbxContextura.setSelectedItem(col.RecuperarObj(posFound).getContextura().toString());//contextura  
this.jtxtC_OJOS.setText(col.RecuperarObj(posFound).getOjos());//color de ojos  
this.jtxtC_PELO.setText(col.RecuperarObj(posFound).getPelo());//color de pelo  
this.jDCfecha.setDate(col.RecuperarObj(posFound).getConsulta());//fecha de cita 
this.jtblImagen.setIcon(col.RecuperarObj(posFound).getPortada());//foto de mascota  
       }
    }//GEN-LAST:event_jbtnBusMasActionPerformed

    private void jbtnElimiMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnElimiMasActionPerformed
        if(this.jtxtcodma.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"SELCCIONE EL BOTON DE BUSQUEDA!!");
      }
    else  {     
        JOptionPane.showConfirmDialog
        (this, "¿ Estás seguro de Eliminar este Registro ?","Reponder",0);
        String cod=this.jtxtcodma.getText();         
        int posremover=col.BuscarObj(cod);
        col.EliminarObj(posremover);  
        this.GrabarEnBinario();
        this.ActualizarTabla();
          }
    }//GEN-LAST:event_jbtnElimiMasActionPerformed

    private void jcbxOrdenMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxOrdenMasActionPerformed
        switch (jcbxOrdenMas.getSelectedIndex()) {
            case 0:
                RecuperarDeBinario();               
                ActualizarTabla();                
                break;
            case 1:
                ord_PorCodigo();
                break;
            case 2:
                this.ord_PorESPECIE();
                break;
            case 3:
                this.ord_PorESTATURA();
                break;
            case 4:
                this.ord_PorMascota();
                break;
            case 5:
                this.ord_PorPELO();
                break;
            case 6:
                this.ord_PorRAZA();
            case 7:
                this.ord_PorSERVICIO();
            case 8:
                this.ord_PorSEXO();
                break;
    }
    }//GEN-LAST:event_jcbxOrdenMasActionPerformed

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalActionPerformed

   }//GEN-LAST:event_jtxtTotalActionPerformed

    private void jtxtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalKeyPressed

  }//GEN-LAST:event_jtxtTotalKeyPressed

    private void jtxtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEdadActionPerformed

    private void jtxtMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMascotaActionPerformed

    private void jtxttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttelefonoActionPerformed

    private void jtxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionActionPerformed

    private void jtxtCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCCActionPerformed

    private void jtxtApeMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApeMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApeMAActionPerformed

    private void jbtnAñadir_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadir_fotoActionPerformed
    JFileChooser dlg = new JFileChooser();//se crea la variable 

    int option=dlg.showOpenDialog(this);//se abre la ventana del directorio

    if(option == JFileChooser.APPROVE_OPTION)
    {
    String file=dlg.getSelectedFile().getPath();
    jtblImagen.setIcon(new ImageIcon(file));//se selecciona la imagen deseada
    ImageIcon icon = new ImageIcon(file);//se actualiza la imagen 
    Image img  = icon.getImage();//se obtiene la  imagen
    Image newimg = img.getScaledInstance(170,190,java.awt.Image.SCALE_SMOOTH);//se ajusta la imagen 
    ImageIcon newIcon = new ImageIcon(newimg);
    jtblImagen.setIcon(newIcon);//se muestra la imagen en el label
    jtblImagen.setSize(170,190);//se cambia al tamaño indicado la imagen
    }
    }//GEN-LAST:event_jbtnAñadir_fotoActionPerformed

    private void jcbxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxEspecieActionPerformed
int posicion;
posicion=this.jcbxEspecie.getSelectedIndex();
switch (posicion){
    
    case 0:
        this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("--SELECCIONAR--");//EDITAR
        break;
    case 1:
              this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("EDITAR");//AVES
        break;
    case 2:
              this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("--SELECCIONAR--");//GATOS
    this.jcbxRAZA.addItem("AMERICANO");
    this.jcbxRAZA.addItem("BIRMANO");
    this.jcbxRAZA.addItem("BOBTAIL");
    this.jcbxRAZA.addItem("ESFINGE");
    this.jcbxRAZA.addItem("JAPONES");
    this.jcbxRAZA.addItem("KORATA");
    this.jcbxRAZA.addItem("PERSA");
    this.jcbxRAZA.addItem("SIAMES");
        break;
    case 3:
              this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("--SELECCIONAR--");//PERROS
    this.jcbxRAZA.addItem("BORDER TERRIER");
    this.jcbxRAZA.addItem("BOXER");
    this.jcbxRAZA.addItem("BOSTON TERRIER");
    this.jcbxRAZA.addItem("CHIHUAHUA");
    this.jcbxRAZA.addItem("CHINO");
    this.jcbxRAZA.addItem("CHOW CHOW");
    this.jcbxRAZA.addItem("COCKER");
    this.jcbxRAZA.addItem("COLLIE");
    this.jcbxRAZA.addItem("DALMATA");
    this.jcbxRAZA.addItem("GOLDEN RETRIEVER");
    this.jcbxRAZA.addItem("BOSTON TERRIER");
    this.jcbxRAZA.addItem("LABRADOR");
    this.jcbxRAZA.addItem("MESTIZO");
    this.jcbxRAZA.addItem("PASTOR");
    this.jcbxRAZA.addItem("ROTTWEILER");
        break;
    case 4:
              this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("EDITAR");
        break;
    case 5:
              this.jcbxRAZA.removeAllItems();
    this.jcbxRAZA.addItem("EDITAR");
        break;
        default:
JOptionPane.showMessageDialog(null, "ERROR");
    }
    }//GEN-LAST:event_jcbxEspecieActionPerformed

    private void jcbxRAZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxRAZAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxRAZAActionPerformed

    private void jbtnR_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnR_sexoActionPerformed
        String mensaje="";
        
        if (this.JrbHEMBRA.isSelected()) {
            mensaje=mensaje+"HEMBRA";//SI SE SELECCIONA LA OPCION HEMBRA SE MUESTRA "HEMBRA"
        } else if (this.JrbMACHO.isSelected()) {
            mensaje=mensaje+"MACHO";//SI SE SELECCIONA LA OPCION MACHO SE MUESTRA "MACHO"
        }
        this.jtxtSEXO.setText(mensaje);
    }//GEN-LAST:event_jbtnR_sexoActionPerformed

    private void jtxtC_OJOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtC_OJOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtC_OJOSActionPerformed

    private void jtxtPESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPESOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPESOActionPerformed

    private void jcbxEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxEstaturaActionPerformed

    private void jcbxContexturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxContexturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxContexturaActionPerformed

    private void jtxtC_PELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtC_PELOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtC_PELOActionPerformed

    private void jbtnLimpiProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiProActionPerformed
int i;      
i= JOptionPane.showConfirmDialog
(null,"¿Estas seguro de Limpiar sin Crear Documento ?","",
JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
if(i==0) //confirmar la limpieza de los campos del formulario
LimpiarEntradas1();
    }//GEN-LAST:event_jbtnLimpiProActionPerformed

    private void jbtnElimiProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnElimiProActionPerformed
  if(this.jtxtCC.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"SELCCIONE EL BOTON DE BUSQUEDA!!");
      }
    else  { 
        JOptionPane.showConfirmDialog
        (this, "¿ Esta seguro de Eliminar éste Registro ?","Reponder",0);
        //confirmacion para continuar con el proceso de eliminacion
        String cod=this.jtxtCC.getText();
        int posremover=pro.BuscarObj(cod);//elimina todos los datos relacionados con el codigo
        pro.EliminarObj(posremover);
        this.GrabarEnBinario1();
        this.ActualizarTabla1();}
    }//GEN-LAST:event_jbtnElimiProActionPerformed

    private void jbtnBusProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBusProActionPerformed
       //lectura del codigo del propietario a consultar
        String cod=JOptionPane.showInputDialog("Ingrese el"
                + " Código del Propietario a consultar");
        //determinar si el codigo existe o no
        if(pro.BuscarObj(cod)==-1){
           JOptionPane.showMessageDialog(null,"Código de Propietario"
                   + " no Existe");  
        }
        else{
            JOptionPane.showMessageDialog(null,"Código de Propietario"
                   + " Existe y esta en la posicion : "+pro.BuscarObj(cod)); 
 //RECUPERANDO LOS DATOS EN EL FORMULARIO
            int posFound = pro.BuscarObj(cod); 
this.jtxtCC.   setText(pro.RecuperarObj(posFound).getCodigo());
this.jtxtNpropietario.   setText(pro.RecuperarObj(posFound).getNom());
this.jtxtApeMA. setText(pro.RecuperarObj(posFound).getApeMA());
this.jtxtApePA. setText(pro.RecuperarObj(posFound).getApePA());  
this.jtxtDireccion.  setText(pro.RecuperarObj(posFound).getDireccion());   
this.jtxttelefono.     setText(pro.RecuperarObj(posFound).getTel());   
this.jDCRegistro.setDate(pro.RecuperarObj(posFound).getRegistro()); 
this.jtxtcorreo.setText(pro.RecuperarObj(posFound).getCorreo());
    }
    }//GEN-LAST:event_jbtnBusProActionPerformed

    private void jbtnActuProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActuProActionPerformed
 if(this.jtxtCC.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"SELCCIONE EL BOTON DE BUSQUEDA!!");
      }
    else  {        
String campo;

campo= VerificarPropietario();
if(campo.equals(""))
              {  
        String cod=this.jtxtCC.getText();
     int posPro=pro.BuscarObj(cod);
     //genero el nuevo objeto actualizado
String nombre=this.jtxtNpropietario.getText().toUpperCase();
String apepa=this.jtxtApeMA.getText().toUpperCase();
String apema=this.jtxtApePA.getText().toUpperCase();
String tel=this.jtxttelefono.getText().toUpperCase();
String direc=this.jtxtDireccion.getText().toUpperCase();
String correo=this.jtxtcorreo.getText();
Date registro=this.jDCRegistro.getDate(); 

   //CREAMOS EL OBJETO
Propietario actualizado=new Propietario(cod,registro,nombre,apepa,apema,tel,correo,
        direc);

 this.jTxatResumen.append("\n");//se muestra los datos del p´ropietario en el area de texto  
 this.jTxatResumen.append("================DATOS DEL PROPIETARIO================"+"\n"); 
 this.jTxatResumen.append("CÓDIGO/CEDULA                 : "+actualizado.codigo+"\n\n"); 
 this.jTxatResumen.append("NOMBRE(S)                  : "+actualizado.nom+"\n\n"); 
 this.jTxatResumen.append("APELLIDO PATERNO           : "+actualizado.apePA+"\n\n");
 this.jTxatResumen.append("APELLIDO MATERNO           : "+actualizado.apeMA+"\n\n");
 this.jTxatResumen.append("REGISTRADO                 : "+actualizado.registro+"\n\n");
 this.jTxatResumen.append("TELÉFONO                   : "+actualizado.tel+"\n\n");
 this.jTxatResumen.append("CORREO                     : "+actualizado.correo+"\n\n");
 this.jTxatResumen.append("Poligran 2019--Derechos Reservados  2019 COPY RIGHT ®");  

   //actualizo la coleccion
pro.ActualizarObj(posPro,actualizado);//se actualiza la posicion del registro
 int i;      
 i= JOptionPane.showConfirmDialog(null,"¿Estas seguro de guardar el registro?","",
 JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
 if(i==0);//pide confirmacion para continuar con el proceso
this.GrabarEnBinario1();
this.ActualizarTabla1();
} 
else JOptionPane.showMessageDialog(null, "VERIFIQUE LOS DATOS : * " +campo);     }
    }//GEN-LAST:event_jbtnActuProActionPerformed

    private void jbtnRegiProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegiProActionPerformed
 String campo;
campo= VerificarPropietario();
if(campo.equals(""))
              {  
String cod=this.jtxtCC.getText().toUpperCase();
String nombre=this.jtxtNpropietario.getText().toUpperCase();
String apema=this.jtxtApeMA.getText().toUpperCase();
String apepa=this.jtxtApePA.getText().toUpperCase();
String tel=this.jtxttelefono.getText().toUpperCase();
String direc=this.jtxtDireccion.getText().toUpperCase();
String correo=this.jtxtcorreo.getText();
Date registro=this.jDCRegistro.getDate(); 

Propietario x = new Propietario(cod,registro,nombre,apepa,apema,tel,correo,direc);
 this.jTxatResumen.append("\n");   
 this.jTxatResumen.append("================DATOS DEL PROPIETARIO================"+"\n"); 
 this.jTxatResumen.append("CÓDIGO/CEDULA                 : "+x.codigo+"\n\n"); 
 this.jTxatResumen.append("NOMBRE(S)                  : "+x.nom+"\n\n"); 
 this.jTxatResumen.append("APELLIDO PATERNO           : "+x.apePA+"\n\n");
 this.jTxatResumen.append("APELLIDO MATERNO           : "+x.apeMA+"\n\n");
 this.jTxatResumen.append("REGISTRADO                 : "+x.registro+"\n\n");
 this.jTxatResumen.append("TELÉFONO                   : "+x.tel+"\n\n");
 this.jTxatResumen.append("CORREO                     : "+x.correo+"\n\n");
 this.jTxatResumen.append("Poli2019--Derechos Reservados  2019 COPY RIGHT ®");   
 
  if (pro.BuscarObj(x.getCodigo())!=-1)
    JOptionPane.showMessageDialog(null,"CODIGO REPETIDO  " +campo);   
	else			
        {      pro.AgrgarObj(x);
   int i;      
      i= JOptionPane.showConfirmDialog(null,"¿Estas seguro de guardar el registro?","",
              JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
         if(i==0);   
InsertareEnTabla1(x, pro.NumObj());
this.GrabarEnBinario1();
ActualizarTabla1();       
 }    
 } 
else JOptionPane.showMessageDialog(null, "VERIFIQUE LOS DATOS : * " +campo);   
    }//GEN-LAST:event_jbtnRegiProActionPerformed

    private void jcbxOrdenaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxOrdenaProActionPerformed
       switch (jcbxOrdenaPro.getSelectedIndex()) {
            case 0:
                RecuperarDeBinario1();               // carga la data nuevamente
                ActualizarTabla1();                // actualiza la tabla nuevamente
                break;
            case 1:
                ord_PorCodigo();
                break;
            case 2:
                this.ord_PorNombre();
                break;
            case 3:
                this.ord_PorApePa();
                break;
            case 4:
                this.ord_PorApeMa();
                break;
           
        }
    }//GEN-LAST:event_jcbxOrdenaProActionPerformed

    private void jtxtNpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNpropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNpropietarioActionPerformed

    private void jtxtApePAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApePAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApePAActionPerformed

    private void jtxtcodmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcodmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodmaActionPerformed

    private void jbtnCrearDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearDocumentoActionPerformed

      int i;      
      i= JOptionPane.showConfirmDialog
      (null,"¿Estas seguro de Crear Documento ?","",
      JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
      if(i==0) //confirmacion para la creacion del documento pdf
      mipdf.crear_PDF(jtxtTitulo.getText(), 
      jtxtAutor.getText(),jtxtAsunto.getText(),jtxtObs.getText(),jTxatResumen.getText());
      this.LimpiarEntradas1();
    }//GEN-LAST:event_jbtnCrearDocumentoActionPerformed
      javaPDF  mipdf= new javaPDF();
    private void jtxtAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAsuntoActionPerformed

    private void jcbxServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxServicioActionPerformed

    private void jtxtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreoActionPerformed

    private void jbtnCrearCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearCorreoActionPerformed
         new email().setVisible(true);
       
    }//GEN-LAST:event_jbtnCrearCorreoActionPerformed

    private void jMItemR_PerrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemR_PerrosActionPerformed
      new Perros().setVisible(true);
    }//GEN-LAST:event_jMItemR_PerrosActionPerformed

    private void jMItemR_GatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemR_GatosActionPerformed
       new Gatos().setVisible(true);       
    }//GEN-LAST:event_jMItemR_GatosActionPerformed

    private void JrbHEMBRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbHEMBRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbHEMBRAActionPerformed

    private void JrbMACHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbMACHOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbMACHOActionPerformed

    private void jbtnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGraficoActionPerformed
//String condicion =jtxtAnalisis.getText();
        if(this.jtxtAnalisis.getText().equalsIgnoreCase("")){
     JOptionPane.showMessageDialog(this,"DEBES MOSTRAR RESUMEN!!");
 }
 else {      //Declarar el grupo de datos
       DefaultPieDataset ds= new DefaultPieDataset();
        //enviar informacion al grupo de datos
        ds.setValue("Análisis Clínicos",Integer.parseInt(this.jtxtAnalisis.getText()));
        ds.setValue("Baños Medicados",Integer.parseInt(this.jtxtBaños.getText()));
        ds.setValue("Cirugía",Integer.parseInt(this.jtxtCirugia.getText()));
        ds.setValue("Destartaje Dental",Integer.parseInt(this.jtxtDestartaje.getText()));
        ds.setValue("Ecografías",Integer.parseInt(this.jtxtEcografias.getText()));
        ds.setValue("Radiografías",Integer.parseInt(this.jtxtRadiografias.getText()));
        //crear el grafico
        JFreeChart jf=ChartFactory.createPieChart3D
                ("VETERINARIA PET-SHOP *POL VET* -- SERVICIOS",
                ds,
                true,
                true,
                false);
        //mostrar el grafico
        ChartFrame fr= new ChartFrame("Poligran 2019 -- ®",jf);
        fr.pack();
        fr.setVisible(true);
 } 
    }//GEN-LAST:event_jbtnGraficoActionPerformed

    private void jMenuAplicativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAplicativosActionPerformed

   }//GEN-LAST:event_jMenuAplicativosActionPerformed

    private void jMItemCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemCalculadoraActionPerformed
        Runtime AplicCalc = Runtime.getRuntime();
        try {
            AplicCalc.exec("C:/WINDOWS/system32/calc.EXE");
        } catch (Exception CALC) {
        }
    }//GEN-LAST:event_jMItemCalculadoraActionPerformed

    private void jMItemExcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemExcellActionPerformed
        Runtime AplicExcel = Runtime.getRuntime();
        try {
            AplicExcel.exec(" C:/Program Files (x86)/Microsoft Office/Office14/EXCEL.EXE");
        } catch (Exception EX) {
        }
    }//GEN-LAST:event_jMItemExcellActionPerformed

    private void jMItemPPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemPPTActionPerformed
        Runtime AplicPowerPoint = Runtime.getRuntime();
        try {
            AplicPowerPoint.exec("C:/Program Files (x86)/Microsoft Office/Office14/POWERPNT.EXE");
        } catch (Exception PP) {
        }
    }//GEN-LAST:event_jMItemPPTActionPerformed

    private void jMItemWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemWordActionPerformed
        Runtime AplicWord = Runtime.getRuntime();
        try {
            AplicWord.exec("C:/Program Files (x86)/Microsoft Office/Office14/WINWORD.EXE");
        } catch (Exception WO) {
        }
    }//GEN-LAST:event_jMItemWordActionPerformed

    private void jtxtResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResumenActionPerformed
                this.jtxtTotal.setText("");//limpiar el area antes de empezar
//        declaracion de variable       
        int  total1 = 0;
        for (int i = 0; i < col.NumObj(); i++) {
            total1 = i + 1;
        }
//        aqui termina el for
        M("Total :"+ total1);  
        
        int a = 0, b = 0, c = 0, d = 0, e = 0, r = 0, total = 0;

        for (int i = 0; i < col.NumObj(); i++) {
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Análisis Clínicos")) {
                a++;//Análisis Clínicos=a
            }
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Baños Medicados")) {
                b++;//Baños Medicados=b
            }
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Cirugías ")) {
                c++;//Cirugías =c  
            }
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Destartaje Dental")) {
                d++;//Destartaje Dental=d
            }
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Ecografías")) {
                e++;//Ecografías=e
            }
            if (col.RecuperarObj(i).servicio.equalsIgnoreCase("Radiografías")) {
                r++;//Radiografías=r
            }
            total = a + b + c + d + e + r;
        }
        this.jtxtServicios.setText(String.valueOf("TOTAL :"+total));
        this.jtxtAnalisis.setText(String.valueOf(a));
        this.jtxtBaños.setText(String.valueOf(b));
        this.jtxtCirugia.setText(String.valueOf(c));
        this.jtxtDestartaje.setText(String.valueOf(d));
        this.jtxtEcografias.setText(String.valueOf(e));
        this.jtxtRadiografias.setText(String.valueOf(r));
    }//GEN-LAST:event_jtxtResumenActionPerformed

    private void jtxtServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtServiciosActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized
   
    void M(String mjs)
    {
    this.jtxtTotal.setText(mjs+"\n");
}
    void CambiarTamañoColumnas()
    {  
   /*Cambio el ancho de las columnas de la tabla jtblDatos*/
   column = jtlbRegistro.getColumnModel().getColumn(0);
   column.setPreferredWidth(30);
   column = jtlbRegistro.getColumnModel().getColumn(1);
   column.setPreferredWidth(80);
   column = jtlbRegistro.getColumnModel().getColumn(2);
   column.setPreferredWidth(200);
   column = jtlbRegistro.getColumnModel().getColumn(3);
   column.setPreferredWidth(110);
   column = jtlbRegistro.getColumnModel().getColumn(4);
   column.setPreferredWidth(80);
    column = jtlbRegistro.getColumnModel().getColumn(5);
   column.setPreferredWidth(90);
    column = jtlbRegistro.getColumnModel().getColumn(6);
   column.setPreferredWidth(70);
    column = jtlbRegistro.getColumnModel().getColumn(7);
   column.setPreferredWidth(100);
   column = jtlbRegistro.getColumnModel().getColumn(8);
   column.setPreferredWidth(100);
   column = jtlbRegistro.getColumnModel().getColumn(9);
   column.setPreferredWidth(100);
   column = jtlbRegistro.getColumnModel().getColumn(10);
   column.setPreferredWidth(100);
   column = jtlbRegistro.getColumnModel().getColumn(11);
   column.setPreferredWidth(100);
   column = jtlbRegistro.getColumnModel().getColumn(12);
   column.setPreferredWidth(100);
}
 //--------------COLUMNAS DEL ARREGLO PROPIETARIO------------
    void CambiarTamañoColumnas1()
    {  
   /*Cambio el ancho de las columnas de la tabla jtblDatos*/
   column = jtlbRegistro1.getColumnModel().getColumn(0);
   column.setPreferredWidth(20);
   column = jtlbRegistro1.getColumnModel().getColumn(1);
   column.setPreferredWidth(80);
   column = jtlbRegistro1.getColumnModel().getColumn(2);
   column.setPreferredWidth(200);
   column = jtlbRegistro1.getColumnModel().getColumn(3);
   column.setPreferredWidth(150);
   column = jtlbRegistro1.getColumnModel().getColumn(4);
   column.setPreferredWidth(95);
    column = jtlbRegistro1.getColumnModel().getColumn(5);
   column.setPreferredWidth(95);
    column = jtlbRegistro1.getColumnModel().getColumn(6);
   column.setPreferredWidth(70);
    column = jtlbRegistro1.getColumnModel().getColumn(7);
   column.setPreferredWidth(180);
}
//*********************************************METODOS****************************
 //metodo para insertar un registro en la tabla MASCOTA
    void InsertareEnTabla(Mascota x,int numeracion)
    { 
 //------------------SE CREA EL ARREGLO DE OBJETOS PARA LAS TABLAS-----------------------
        Object[] fila={ numeracion,x.codigo,x.servicio,x.consulta,x.n_mascota,
                        x.edad,x.sexo,x.peso,x.especie,x.raza,
                        x.estatura,x.contextura,x.ojos,x.pelo};      
// -------------------SE AGREGA NUEVOS DATOS AL MODELO DE LA TABLA-----------------------
              Tabla_Mas.addRow(fila);
    }
  //------METODO DE LA CLASE PROPIETARIO
    void InsertareEnTabla1(Propietario p,int numeracion)
    { 
        Object[] fila={ numeracion,p.codigo,p.registro,p.nom,
                p.apePA,p.apeMA,p.tel,p.correo,p.direccion};
                Tabla_Pro.addRow(fila);
    }
    //----METODO PARA ACTUALIZAR TABLA DE REGISTRO DE MASCOTA-----
    void ActualizarTabla()
    {
    //limpiar la tabla
    int nf=this.jtlbRegistro.getRowCount();
    for(int i=0;i<nf;i++){
        this.Tabla_Mas.removeRow(0);
    }
    //completando la tabla
    for(int i=0;i<col.NumObj();i++){
        this.InsertareEnTabla(col.RecuperarObj(i),i+1);
    }        
    }
 //-------METODO PARA ACTUALIZAR TABLA PROPIETARIO-----
    void ActualizarTabla1()
    {
    //limpiar la tabla
    int nf=this.jtlbRegistro1.getRowCount();
    for(int i=0;i<nf;i++){
        this.Tabla_Pro.removeRow(0);
    }
    //completando la tabla
    for(int i=0;i<pro.NumObj();i++){
    this.InsertareEnTabla1(pro.RecuperarObj(i),i+1);
    }        
    }
   //------------------------METODO PARA LIMPIAR LOS DATOS DEL FORMULARIO PROPIETARIO--------------------------------------------
    void LimpiarEntradas1()
    {
    this.jtxtCC.setText("");
    this.jtxtNpropietario.setText("");
    this.jtxtApeMA.setText("");
    this.jtxtApePA.setText("");
    this.jDCRegistro.setDate(null);
    this.jtxtDireccion.setText("");
    this.jtxttelefono.setText("");
    this.jtxtcorreo.setText("");
    this.jTxatResumen.setText("========================POL VET============================"+ 
                         "\n"+"=========================================================================");
     jtxtCC.requestFocus();
    }
//--------------------------------DATOS DE MASCOTA---------------------------------------------------
  //Metodo para  los campos de la ventana MASCOTA
    void LimpiarEntradas()
    {
    this.jtxtMascota.setText("");//NOMBRE DE MASCOTA
    this.jcbxEspecie.setSelectedIndex(0);//ESPECIE DE MASCOTA
    this.jcbxRAZA.setSelectedIndex(0);//RAZA DE MASCOTA
    this.jcbxEstatura.setSelectedIndex(0);//ESTURA DE MASCOTA
    this.jcbxContextura.setSelectedIndex(0);//CONTEXTURA DE MASCOTA
    this.jcbxServicio.setSelectedIndex(0);//SERVICIO
    this.jtxtSEXO.setText("");//SEXO DE MASCOTA
    this.jtxtEdad.setText("0.0");//EDAD DE LA MASCOTA
    this.jtxtTotal.setText("");//TOTAL DE MASCOTAS
    this.jDCfecha.setDate(null);//FECHA DE CITA
    this.jtblImagen.setIcon(null);//IMAGEN DE MASCOTA
    this.jtxtPESO.setText("0.0");//PESO DE MASCOTA
    this.jtxtC_PELO.setText("");//COLOR DE PELO DE MASCOTA
    this.jtxtC_OJOS.setText("");//COLOR DE OJOS DE MASCOTA
    this.jtxtcodma.setText("");//CODIGO
    this.jtxtAnalisis.setText("");
    this.jtxtCirugia.setText("");
    this.jtxtDestartaje.setText("");
    this.jtxtEcografias.setText("");
    this.jtxtServicios.setText("");
    this.jtxtRadiografias.setText("");
    this.jtxtBaños.setText("");
     jtxtMascota.requestFocus();//RETORNAR  AL CAMPO NOMBRE DE MASCOTA
    }
    //--------------METODO PARA GUARDAR EN BINARIO LOS REGISTROS DE MASCOTA------------
    public void GrabarEnBinario()
    {
     try{
       //1. especificar el nombre del archivo en binario 
       FileOutputStream fos=new FileOutputStream("MÁSCOTAS.bin");
       //2. hace el flujo en el Archivo binario y el aplicativo
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //3. se evalua el objeto para veriicar la conexion
       if(oos!=null){
          oos.writeObject(col);
          oos.close();
       }    
       }catch(Exception v){
       JOptionPane.showMessageDialog(null,"No se puede"
             + " grabar informacion en el archivo"
             + " binario.."+v); 
      }       
      } 
    
    
    public void RecuperarDeBinario()
    {
     try{
         FileInputStream fis=new FileInputStream("MÁSCOTAS.bin");
         ObjectInputStream ois=new ObjectInputStream(fis);
         if(ois!=null){
             col= (Arreglo_Mascota)ois.readObject(); //upcasting
             ois.close();
         } 
     }catch(Exception z){
        JOptionPane.showMessageDialog(null,"No se puede"
             + " recuperar la informacion en el archivo"
             + " binario.."+z); 
     }    
     
 }
    //------METODO GRABAR EN BINARIO FORMULARIO PROPIETARIO--------
    public void GrabarEnBinario1()
    {
     try{
        //1. especificar el nombre del archivo binario 
       FileOutputStream fos=new FileOutputStream("PROPIETARIOS.bin");
        //2. hace el flujo en el archivo binario y el aplicativo
       ObjectOutputStream oos=new ObjectOutputStream(fos);
        //3. se evalua el objeto para veriicar la conexion
       if(oos!=null){
          oos.writeObject(pro);
          oos.close();
       }
       }catch(Exception v){
       JOptionPane.showMessageDialog(null,"No se puede"
             + " grabar informacion en el archivo"
             + " binario.."+v); 
     }       
     }  
    public void RecuperarDeBinario1()
    {
     try{
         FileInputStream fis=new FileInputStream("PROPIETARIOS.bin");
         ObjectInputStream ois=new ObjectInputStream(fis);
         if(ois!=null){
             pro= (Arreglo_Propietario)ois.readObject(); //upcasting
             ois.close();
         } 
     }catch(Exception z){
        JOptionPane.showMessageDialog(null,"No se puede" 
             + " recuperar la informacion en el archivo"
             + " binario.."+z); 
     }    
     
 }
 //---------METODOS DE ORDENACION DE LA CLASE PROPIETARIO--------
    void ord_PorCodigo1()//== ordenar por Cedula
    {   int n=pro.NumObj();
            int menor;
            Propietario aux;
            for (int p=0; p <n-1; p++)
            {   menor=p;
                for(int q=(p+1);q<n;q++)
            {  //
                String codActual=pro.RecuperarObj(q).getCodigo();
                String codMenor=pro.RecuperarObj(menor).getCodigo();
                if(codActual.compareToIgnoreCase(codMenor)<0)
                    { menor=q; }
                }// fin del for
                aux =  pro.RecuperarObj(p);
           pro.ActualizarObj(p,pro.RecuperarObj(menor));
               pro.ActualizarObj(menor, aux);
        }
        ActualizarTabla1();
        }
    void ord_PorNombre()//
    {   int n=pro.NumObj();
            int menor;
            Propietario aux;
            for (int p=0; p <n-1; p++)
            {   menor=p;
                for(int q=(p+1);q<n;q++)
            {  //
                String codActual=pro.RecuperarObj(q).getNom();
                String codMenor=pro.RecuperarObj(menor).getNom();
                if(codActual.compareToIgnoreCase(codMenor)<0)
                    { menor=q; }
                }// fin del for
                aux =  pro.RecuperarObj(p);
           pro.ActualizarObj(p,pro.RecuperarObj(menor));
               pro.ActualizarObj(menor, aux);
        }
        ActualizarTabla1();
        }
    void ord_PorApePa()//
    {   int n=pro.NumObj();
            int menor;
            Propietario aux;
            for (int p=0; p <n-1; p++)
            {   menor=p;
                for(int q=(p+1);q<n;q++)
            {  //
                String codActual=pro.RecuperarObj(q).getApePA();
                String codMenor=pro.RecuperarObj(menor).getApePA();
                if(codActual.compareToIgnoreCase(codMenor)<0)
                    { menor=q; }
                }// fin del for
                aux =  pro.RecuperarObj(p);
           pro.ActualizarObj(p,pro.RecuperarObj(menor));
               pro.ActualizarObj(menor, aux);
        }
        ActualizarTabla1();
        }
    void ord_PorApeMa()//
    {   int n=pro.NumObj();
            int menor;
            Propietario aux;
            for (int p=0; p <n-1; p++)
            {   menor=p;
                for(int q=(p+1);q<n;q++)
            {  //
                String codActual=pro.RecuperarObj(q).getApeMA();
                String codMenor=pro.RecuperarObj(menor).getApeMA();
                if(codActual.compareToIgnoreCase(codMenor)<0)
                    { menor=q; }
                }// fin del for
                aux =  pro.RecuperarObj(p);
           pro.ActualizarObj(p,pro.RecuperarObj(menor));
               pro.ActualizarObj(menor, aux);
        }
        ActualizarTabla1();
        }
 //---------METODOS DE ORDENACION DE LA CLASE MASCOTA--------
    void ord_PorCodigo()//== ordenar por c
    {   int n=col.NumObj();
            int menor;
            Mascota aux;
            for (int p=0; p <n-1; p++)
            {   menor=p;
                for(int q=(p+1);q<n;q++)
            {  //
                String codActual=col.RecuperarObj(q).getCodigo();
                String codMenor=col.RecuperarObj(menor).getCodigo();
                if(codActual.compareToIgnoreCase(codMenor)<0)
                    { menor=q; }
                }// fin del for
                aux =  col.RecuperarObj(p);
            col.ActualizarObj(p,col.RecuperarObj(menor));
                col.ActualizarObj(menor, aux);
        }
        ActualizarTabla();
        }
    void ord_PorMascota()
    {
                    int n=col.NumObj();
                    Mascota aux;
                    for (int q=0; q <(n-1); q++)
                    {  for(int p=0;p<(n-1)-q;p++)
                        {  //
                        String nomAnt=col.RecuperarObj(p).getN_mascota();
                        String nomSig=col.RecuperarObj(p+1).getN_mascota();
                        if(nomAnt.compareToIgnoreCase(nomSig)>0)
                            {  aux = col.RecuperarObj(p);
                                col.ActualizarObj(p,col.RecuperarObj(p+1));
                                col.ActualizarObj(p+1, aux);
                            }
                        }// fin del for
                }
                    ActualizarTabla();
                }
    void ord_PorESPECIE()
    {
                    int n=col.NumObj();
                    Mascota aux;
                    for (int q=0; q <(n-1); q++)
                    {  for(int p=0;p<(n-1)-q;p++)
                        {  //
                        String nomAnt=col.RecuperarObj(p).getEspecie();
                        String nomSig=col.RecuperarObj(p+1).getEspecie();
                        if(nomAnt.compareToIgnoreCase(nomSig)>0)
                            {  aux = col.RecuperarObj(p);
                                col.ActualizarObj(p,col.RecuperarObj(p+1));
                                col.ActualizarObj(p+1, aux);
                            }
                        }// fin del for
                }
                    ActualizarTabla();
                }
    void ord_PorSEXO()
    {
                    int n=col.NumObj();
                    Mascota aux;
                    for (int q=0; q <(n-1); q++)
                    {  for(int p=0;p<(n-1)-q;p++)
                        {  //
                        String nomAnt=col.RecuperarObj(p).getSexo();
                        String nomSig=col.RecuperarObj(p+1).getSexo();
                        if(nomAnt.compareToIgnoreCase(nomSig)>0)
                            {  aux = col.RecuperarObj(p);
                                col.ActualizarObj(p,col.RecuperarObj(p+1));
                                col.ActualizarObj(p+1, aux);
                            }
                        }
                }
                    ActualizarTabla();
                }               
    void ord_PorRAZA()
    {   int n=col.NumObj();
        int menor;
        Mascota aux;
        for (int p=0; p <n-1; p++)
        {   menor=p;
            for(int q=(p+1);q<n;q++)
           {  //
               String codActual=col.RecuperarObj(q).getRaza();
               String codMenor=col.RecuperarObj(menor).getRaza();
               if(codActual.compareToIgnoreCase(codMenor)<0)
                 { menor=q; }
	     }// fin del for
             aux =  col.RecuperarObj(p);
           col.ActualizarObj(p,col.RecuperarObj(menor));
            col.ActualizarObj(menor, aux);
       }
       ActualizarTabla();
    }
    
    void ord_PorESTATURA()
    {   int n=col.NumObj();
        int menor;
        Mascota aux;
        for (int p=0; p <n-1; p++)
        {   menor=p;
            for(int q=(p+1);q<n;q++)
           {  //
               String codActual=col.RecuperarObj(q).getEstatura();
               String codMenor=col.RecuperarObj(menor).getEstatura();
               if(codActual.compareToIgnoreCase(codMenor)<0)
                 { menor=q; }
	     }// fin del for
             aux =  col.RecuperarObj(p);
           col.ActualizarObj(p,col.RecuperarObj(menor));
            col.ActualizarObj(menor, aux);
       }
       ActualizarTabla();
    }
    void ord_PorPELO()
    {   int n=col.NumObj();
        int menor;
        Mascota aux;
        for (int p=0; p <n-1; p++)
        {   menor=p;
            for(int q=(p+1);q<n;q++)
           {  //
               String codActual=col.RecuperarObj(q).getPelo();
               String codMenor=col.RecuperarObj(menor).getPelo();
               if(codActual.compareToIgnoreCase(codMenor)<0)
                 { menor=q; }
	     }// fin del for
             aux =  col.RecuperarObj(p);
           col.ActualizarObj(p,col.RecuperarObj(menor));
            col.ActualizarObj(menor, aux);
       }
       ActualizarTabla();
    }   
    void ord_PorSERVICIO()
    {   int n=col.NumObj();
        int menor;
        Mascota aux;
        for (int p=0; p <n-1; p++)
        {   menor=p;
            for(int q=(p+1);q<n;q++)
           {  //
               String codActual=col.RecuperarObj(q).getServicio();
               String codMenor=col.RecuperarObj(menor).getServicio();
               if(codActual.compareToIgnoreCase(codMenor)<0)
                 { menor=q; }
	     }// fin del for
             aux =  col.RecuperarObj(p);
           col.ActualizarObj(p,col.RecuperarObj(menor));
            col.ActualizarObj(menor, aux);
       }
       ActualizarTabla();
    }
    public void vaciar_tabla()
    {
int filas=jtlbRegistro.getRowCount();
for(int i=0;i<filas;i++)
    this.Tabla_Mas.removeRow(0); // removiendo la fila de la tabla
}
  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new plataforma().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JrbHEMBRA;
    private javax.swing.JRadioButton JrbMACHO;
    private javax.swing.ButtonGroup grupoSEXO;
    private com.toedter.calendar.JDateChooser jDCRegistro;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMItemAcercaDe;
    private javax.swing.JMenuItem jMItemCalculadora;
    private javax.swing.JMenuItem jMItemExcell;
    private javax.swing.JMenuItem jMItemPPT;
    private javax.swing.JMenuItem jMItemR_Gatos;
    private javax.swing.JMenuItem jMItemR_Perros;
    private javax.swing.JMenuItem jMItemWord;
    private javax.swing.JMenu jMenuAplicativos;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTxatResumen;
    private javax.swing.JButton jbtnActuMas;
    private javax.swing.JButton jbtnActuPro;
    private javax.swing.JButton jbtnAñadir_foto;
    private javax.swing.JButton jbtnBusMas;
    private javax.swing.JButton jbtnBusPro;
    private javax.swing.JButton jbtnCrearCorreo;
    private javax.swing.JButton jbtnCrearDocumento;
    private javax.swing.JButton jbtnElimiMas;
    private javax.swing.JButton jbtnElimiPro;
    private javax.swing.JButton jbtnGrafico;
    private javax.swing.JButton jbtnLimpiMas;
    private javax.swing.JButton jbtnLimpiPro;
    private javax.swing.JButton jbtnR_sexo;
    private javax.swing.JButton jbtnRegMas;
    private javax.swing.JButton jbtnRegiPro;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    private jcMousePanel.jcMousePanel jcMousePanel4;
    private jcMousePanel.jcMousePanel jcMousePanel5;
    private javax.swing.JComboBox jcbxContextura;
    private javax.swing.JComboBox jcbxEspecie;
    private javax.swing.JComboBox jcbxEstatura;
    private javax.swing.JComboBox jcbxOrdenMas;
    private javax.swing.JComboBox jcbxOrdenaPro;
    private javax.swing.JComboBox jcbxRAZA;
    private javax.swing.JComboBox jcbxServicio;
    public javax.swing.JLabel jtblImagen;
    private javax.swing.JTable jtlbRegistro;
    private javax.swing.JTable jtlbRegistro1;
    private javax.swing.JTextField jtxaReporte;
    private javax.swing.JTextField jtxtAnalisis;
    private javax.swing.JTextField jtxtApeMA;
    private javax.swing.JTextField jtxtApePA;
    private javax.swing.JTextField jtxtAsunto;
    private javax.swing.JTextField jtxtAutor;
    private javax.swing.JTextField jtxtBaños;
    private javax.swing.JTextField jtxtCC;
    private javax.swing.JTextField jtxtC_OJOS;
    private javax.swing.JTextField jtxtC_PELO;
    private javax.swing.JTextField jtxtCirugia;
    private javax.swing.JTextField jtxtDestartaje;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEcografias;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtMascota;
    private javax.swing.JTextField jtxtNpropietario;
    private javax.swing.JTextField jtxtObs;
    private javax.swing.JTextField jtxtPESO;
    private javax.swing.JTextField jtxtRadiografias;
    private javax.swing.JButton jtxtResumen;
    private javax.swing.JTextField jtxtSEXO;
    private javax.swing.JTextField jtxtServicios;
    private javax.swing.JTextField jtxtTitulo;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtcodma;
    private javax.swing.JTextField jtxtcorreo;
    private javax.swing.JTextField jtxttelefono;
    // End of variables declaration//GEN-END:variables
}
