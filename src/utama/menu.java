/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;
    import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import controller.MySQL;

/**
 *
 * @author ASUS
 */


public class menu extends JFrame implements ActionListener {
    private JPanel jpMenu = new JPanel();
    private JLabel lblTanggalbulantahunpembeli = new JLabel("Tanggal, bulan, tahun pembeli:"),
            lblNamaPembeli = new JLabel("Nama Pembeli:"),
            lblMinuman = new JLabel("Minuman:"),
            lblBanyaknya = new JLabel("Banyaknya:"),lblHargaminuman = new JLabel("Harga / minuman:"),lblTotalharga = new JLabel("Total harga:"),
            lblBayar = new JLabel("Bayar:"),lblKembali = new JLabel("Kembali:");
    private JTextField txtTanggalbulantahunpembeli = new JTextField(),txtNamaPembeli = new JTextField(),
            txtBanyaknya = new JTextField(),txtHargaminuman = new JTextField(),txtTotalharga = new JTextField(),
            txtBayar = new JTextField(),txtKembali = new JTextField();
    private JComboBox cboMinuman = new JComboBox();
    private JButton btnTambah = new JButton("Tambah"),btnUbah = new JButton("Ubah"),
            btnHapus = new JButton("Hapus"),btnBersih = new JButton("Bersih");
   
    String[] strJdl={"Tanggal, bulan , tahun pembeli","Nama pembeli","Minuman","Banyaknya","Harga minuman","Total harga","Bayar","Kembali"};
    //Deklarasi untuk Tabel
    JTable tabel = new JTable();
    JScrollPane skrTabel = new JScrollPane();
   
    menu (){
        super("Daftar Minum");
        setSize(550,500);
        jpMenu.setLayout(null);
       
        //mengatur letak objek pada container
        lblTanggalbulantahunpembeli.setBounds(15, 20, 100, 25);
        lblNamaPembeli.setBounds(15, 55, 100, 25);
        lblMinuman.setBounds(15, 90, 100, 25);
        lblBanyaknya.setBounds(15, 125, 100, 25);
        lblHargaminuman.setBounds(15,  160, 100, 25);
        lblTotalharga.setBounds(15, 195, 100, 25);
        lblBayar.setBounds(15, 230, 100, 25);
        lblKembali.setBounds(15, 265, 100, 25);
       
        txtTanggalbulantahunpembeli.setBounds(115, 20, 100, 25);
        txtNamaPembeli.setBounds(115, 55, 100, 25);
        cboMinuman.setBounds(115, 90, 100, 25);
        txtBanyaknya.setBounds(115, 125, 150, 25);
        txtHargaminuman.setBounds(115, 160, 100, 25);
        txtTotalharga.setBounds(115, 195, 100, 25);
        txtBayar.setBounds(115, 230, 100, 25);
        txtKembali.setBounds(115, 265, 100, 25);
       
        btnTambah.setBounds(340, 20, 85, 25);
        btnUbah.setBounds(340, 55, 85, 25);
        btnHapus.setBounds(340, 90, 85, 25);
        btnBersih.setBounds(340, 125, 85, 25);

       
        
    skrTabel.getViewport().add(tabel);
    tabel.setEnabled(true);
    skrTabel.setBounds(15, 300, 470, 115);

    //menambahkan tabel pada panel
    jpMenu.add(skrTabel);

        //mengatur/meletakkan objek pada objek panel
        jpMenu.add(lblTanggalbulantahunpembeli);
        jpMenu.add(lblNamaPembeli);
        jpMenu.add(lblMinuman);
        jpMenu.add(lblBanyaknya);
        jpMenu.add(lblHargaminuman);
        jpMenu.add(lblTotalharga);
        jpMenu.add(lblBayar);
        jpMenu.add(lblKembali);
        jpMenu.add(txtTanggalbulantahunpembeli);
        jpMenu.add(txtNamaPembeli);
        jpMenu.add(cboMinuman);
        jpMenu.add(txtBanyaknya);
        jpMenu.add(txtHargaminuman);
        jpMenu.add(txtTotalharga);
        jpMenu.add(txtBayar);
        jpMenu.add(txtKembali);
       
        jpMenu.add(btnTambah);
        jpMenu.add(btnUbah);
        jpMenu.add(btnHapus);
        jpMenu.add(btnBersih);
       
        //mengatur objek agar dapat berinteraksi dengan user
        btnTambah.addActionListener(this);
        btnUbah.addActionListener(this);
        btnHapus.addActionListener(this);
        btnBersih.addActionListener(this);
       
        //mengisi combo Jenis kelamin
        cboMinuman.addItem("Jambu");
        cboMinuman.addItem("Jeruk");
        cboMinuman.addItem("Wortel");
        cboMinuman.addItem("Apel");
        cboMinuman.addItem("Nanas");
        cboMinuman.addItem("Tomat");
        cboMinuman.addItem("Melon");
        cboMinuman.addItem("Alpukat");
        cboMinuman.addItem("Belimbing");
        cboMinuman.addItem("Buah naga");
        cboMinuman.addItem("Mangga");
        cboMinuman.addItem("Sirsak");
        
        //menambahkan objek JPanel pada container frame
        getContentPane().add(jpMenu);
        //menampilkan tabel siswa ke komponen tabel
        TampilTabel();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //pengaturan Tabel
       
        skrTabel.getViewport().add(tabel);
        tabel.setEnabled(true);
        skrTabel.setBounds(15, 300, 470, 115);
       
        //menambahkan tabel pada panel
        jpMenu.add(skrTabel);
       
        //menambahkan objek JPanel pada container frame
        getContentPane().add(jpMenu);
        //menampilkan tabel siswa ke komponen tabel
        TampilTabel();
       
    }
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj ==btnTambah){
            Tambah();
        }
        if (obj == btnUbah){
            Ubah();
        }
        if (obj == btnHapus){
            Hapus();
        }
        Bersih();
        
    }
    void Bersih(){
        txtTanggalbulantahunpembeli.setText("");
        txtNamaPembeli.setText("");
        cboMinuman.setSelectedIndex(0);
        txtBanyaknya.setText("");
        txtHargaminuman.setText("");
        txtTotalharga.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
    }

    void Tambah(){
        try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "INSERT INTO pemasukan VALUES"
                    + "('"+txtTanggalbulantahunpembeli.getText()
                    +"','"+txtNamaPembeli.getText()
                    +"','"+cboMinuman.getSelectedItem()
                    +"','"+txtBanyaknya.getText()
                    +"','"+txtHargaminuman.getText()
                    +"','"+txtTotalharga.getText()
                    +"','"+txtBayar.getText()
                    +"','"+txtKembali.getText()+"')";
            
            int row = st.executeUpdate(sql);
           
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah ditambahkan ke"+" database","infomasi",JOptionPane.INFORMATION_MESSAGE);
             con.close();
            }
            TampilTabel();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke"+
                    e.getMessage() ,"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
    void Ubah(){
        try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
           
            String sql = "UPDATE `pemasukan` SET `Tanggal` = '"+txtTanggalbulantahunpembeli.getText()+"',`Minuman`='"+cboMinuman.getSelectedItem()+"',`Banyaknya`='"+txtBanyaknya.getText()+
                    "',`Harga / minuman`='"+txtHargaminuman.getText()+"',`Total harga`='"+txtTotalharga.getText()+"',`Bayar`='"+txtBayar.getText()+"',`Kembali`='"+txtBayar.getText()+
                    "' WHERE `Nama Pembeli` ='"+txtNamaPembeli.getText()+"' "; 
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah di update ","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak diUbah"+
                    e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
    void Hapus(){
        try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "DELETE FROM `pemasukan` WHERE `Nama Pembeli` = '"+txtNamaPembeli.getText()+"' ";
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah dihapus dari " +" database","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak dihapus","infomasi",JOptionPane.
                    INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
void TampilTabel(){
        try {
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM pemasukan";
            ResultSet set = st.executeQuery(sql);
            //menampilkan data ke Tabel
            ResultSetTableModel model = new ResultSetTableModel(set);
            tabel.setModel(model);

            while(set.next()){
                txtTanggalbulantahunpembeli.setText(Integer.toString(set.getInt("Tanggal")));
                txtNamaPembeli.setText(set.getString("Nama Pembeli"));
                cboMinuman.addItem(set.getString("Minuman"));
                txtBanyaknya.setText(set.getString("Banyaknya"));
                txtHargaminuman.setText(set.getString("Harga / minuman"));
                txtTotalharga.setText(set.getString("Total harga"));
            }
        }
        catch(SQLException e) {
            System.out.println("gagal query");
        }
   }
    public static void main (String[] args){
        new menu();
    }
}
