**SIMULASI UTS : CRUD DATABASE WITH JAVA SWING**

**Deskripsi**

Pada Simulasi UTS Pemrograman Berbasis Objek (PBO) ini, yaitu mengimplementasikan Aplikasi CRUD Data Buku Menggunakan Java Swing dan PostgreSQL, 
dengan database buku. Pada Simulasi ini, diminta untuk mengembangkan sebuah Aplikasi Pengelolaan Data buku menggunakan bahasa pemrograman Java 
yang terhubung dengan database PostgreSQL. Aplikasi ini memiliki antarmuka berbasis GUI (Graphical User Interface) yang dibangun menggunakan Java Swing 
dan mendukung operasi CRUD (Create, Read, Update, Delete) untuk data petugas.

**Koneksi Database**

Dalam tahap koneksi database pastikan sudah menyiapkan database dan membuat tabel buku dengan struktur yang sesuai, seperti kolom isbn, judul_buku, tahun_terbit, 
dan penerbit. Aplikasi ini terhubung ke database menggunakan JDBC, dengan library PostgreSQL yang diperlukan untuk mengelola operasi CRUD (Create, Read, Update, Delete) pada data petugas. Kemudian, perlu memastikan bahwa koneksi ke database berhasil, lalu melanjutkan untuk mengimplementasikan 
fitur-fitur CRUD dengan antarmuka berbasis Java Swing.

**Pembuatan Antarmuka GUI**

Tampilan form Data buku yang saya buat menggunakan Java Swing sebagai antarmuka grafis (GUI) terdapat beberapa komponen seperti JTextField untuk input data, 
JButton untuk melakukan operasi CRUD (Insert, Update, Delete, Clear). Bagian bawah form dilengkapi dengan JTable yang berfungsi untuk menampilkan data petugas 
yang tersimpan di database. Setiap komponen ini diatur dalam JPanel dan dirender di dalam JFrame untuk membangun antarmuka aplikasi yang interaktif 
dan mudah digunakan.

**Create Data / Insert**

Pada file yang sudah saya bagikan sebelumnya, terdapat fungsi "btnInsertActionPerformed", dimana fungsi ini berfungsi sebagai perintah  insert data kedalam database. 
Ketika data sudah berhasil ditambahkan kedalam ddtabase, maka tabel yang ada akan secara otomatis menampilkan data yang sudah berhasil diinputkan sebelumnya. Sebelum 
konfirmasi  bahwa data akan dimasukkan, pastikan semua  textfield yang tersedia sudah diisi sebelumnya. Memasukkan data yang digunakan juga harus sesuai dengan tipe data
yang sudah dipersiapkan pada database sebelumnya.

**Read Data**

Terdapat Fungsi "tblbukuTabelMouseClicked" pada kode yang diberikan menangani kejadian ketika tabel buku diklik. Fungsi ini bertujuan untuk memudahkan pengguna 
dalam mengedit data buku. Saat pengguna mengklik baris di tabel, data dari baris tersebut akan diisi ke dalam field input di antarmuka pengguna, sehingga pengguna 
dapat dengan mudah melihat informasi buku yang dipilih. Fungsi ini digunakan untuk mengisi field input secara otomatis saat baris pada tabel dipilih oleh pengguna.
Ketika baris di tabel diklik, data dari tabel akan diambil sesuai baris dan kolom yang dipilih, lalu diisi ke dalam text field.

**Update Data**

Terdapat Fungsi "btnUpdateActionPerformed" Fungsi ini digunakan untuk memperbarui data buku berdasarkan ISBN yang diambil dari tblbuku. Data baru yang bisa diubah adalah judul buku, tahun terbit, dan penerbit.
Nilai baru dari judul, tahun terbit, dan penerbit diambil dari input pengguna dan dimasukkan ke dalam query SQL. Jika eksekusi query berhasil dan ada data yang diperbarui, pengguna diberi pesan konfirmasi bahwa data berhasil diupdate.

**Delete Data**

Fungsi ini digunakan untuk menghapus data buku berdasarkan ISBN. Setelah berhasil, koneksi akan di-commit dan ditutup. Ini merupakan fungsi yang dijalankan ketika tombol "Delete" ditekan untuk menghapus data buku dari database PostgreSQL. Pertama, ISBN divalidasi untuk memastikan tidak kosong. Jika kosong, pesan peringatan muncul menggunakan JOptionPane. Query SQL untuk menghapus data buku berdasarkan ISBN disiapkan. Jika berhasil, data buku dihapus, dan input form di-reset. Setelah proses selesai, koneksi ke database ditutup dan tampilan data diperbarui.

**Langkah - Langkah**

1. Menghubungkan Netbeans dengan database yakni menambahkan libraries postgreSql.jar untuk eksekusi
![image](https://github.com/user-attachments/assets/445d02ab-5898-45ae-8ea5-f10928a702fa)


2. Membuat  class untuk koneksi netbeans dengan database terkait, berikut source codenya :
   ![image](https://github.com/user-attachments/assets/260a531b-86c9-4098-b18d-cfd6bb6ee273)

   
3. Membuat class JFrameForm dan menyesuaikan tampilannya
   ![image](https://github.com/user-attachments/assets/6fe6286f-624f-4703-84c0-79cf269ff74c)

   
4. Membuat perintah untuk insert button, berikut source codenya :
   ![image](https://github.com/user-attachments/assets/0a0b647a-1d36-43e7-9103-eff400c71782)

   
5. Membuat perintah untuk update button, berikut source codenya :
   ![image](https://github.com/user-attachments/assets/f0ac0602-83a7-4b25-addd-6b54f7c6b348)

   
6. Membuat perintah untuk delete button, berikut source codenya :
   ![image](https://github.com/user-attachments/assets/c6382f06-eeba-4858-8f02-d5eb5052d34d)


7. Membuat perintah untuk clear button, berikut source codenya :
   ![image](https://github.com/user-attachments/assets/fa31281f-53c1-4536-b2b8-527a7f2d15e4)


8. Terdapat perintah untuk tabel, yakni "tblmouseclicked" untuk interaksi terhadap tabel agar dapat dibaca oleh text field
   ![image](https://github.com/user-attachments/assets/f104c82e-4e95-4a96-a984-bba1051ea656)


9. Jalankan classnya untuk mendapat hasilnya
    ![image](https://github.com/user-attachments/assets/3b915b2c-f1b9-4e47-8435-75bac2eeb432)


Demikian materi ini disampaikan. Semoga penjelasan diatas dapat membantu memahami materi simulasi UTS mata kuliah Pemrograman Berorientasi Objek ini.









