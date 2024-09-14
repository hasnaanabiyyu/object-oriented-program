**CRUD Database, Try Catch Exception, Throw Exception, and Custom Exception**

**CRUD**
CREATE : Operasi Create digunakan untuk menambahkan data baru ke dalam tabel di database. Biasanya, ini dilakukan menggunakan pernyataan SQL INSERT.
READ : Operasi Read digunakan untuk mengambil data dari tabel. Ini biasanya dilakukan dengan pernyataan SQL SELECT.
UPDATE : Operasi Update digunakan untuk memperbarui data yang sudah ada di dalam tabel. Ini dilakukan dengan pernyataan SQL UPDATE.
DELETE : Operasi Delete digunakan untuk menghapus data dari tabel. Ini dilakukan dengan pernyataan SQL DELETE.
Dalam konteks database, CRUD merujuk pada operasi dasar yang dapat dilakukan pada basis data. 
Dalam Java, untuk melakukan operasi CRUD pada database, sering digunakan JDBC (Java Database Connectivity) untuk menghubungkan aplikasi dengan database.
Pada File Connect diatas, yakni untuk mengkoneksikan antara Java dengan Database yang digunakan
Pada File Crud diatas, adalah source code untuk melakukan perintah CRUD pada database menggunakan JAVA

**Try Catch Exception**
Konsep try-catch digunakan untuk menangani pengecualian (exception) yang mungkin terjadi selama eksekusi program. 
Ini memastikan bahwa program tidak crash ketika terjadi kesalahan, dan memungkinkan Anda untuk mengambil tindakan yang diperlukan saat terjadi kesalahan.
Dalam contoh di atas, jika terjadi exception pada blok try, program akan melompat ke blok catch dan menjalankan kode di dalamnya.

**Throw Exception**
throw digunakan untuk memicu sebuah exception secara manual dalam program. 
Misalnya, jika sebuah kondisi tertentu terjadi, Anda mungkin ingin melempar exception untuk mengindikasikan bahwa ada masalah yang harus ditangani.

**Custom Exception**
Custom Exception digunakan ketika Anda ingin membuat pengecualian khusus yang lebih relevan dengan bisnis atau kebutuhan aplikasi Anda. 
Untuk membuat custom exception, Anda perlu membuat kelas baru yang meng-extend kelas Exception atau RuntimeException.
