# Gim Oray

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Snake Game adalah implementasi dari game terkenal yaitu Snake dimana ada seekor ular yang dapat diarahkan untuk memakan buah. Dan jika ular tersebut memakan buah, panjangnya akan bertambah.**

## Credits
| NPM           | Name        |
| ------------- |-------------|
| 140810190027  | Zahra Claura Hermawan    |
| 140810190039  | Muhammad Raihan Fatoni    |
| 140810190073  | Farhan Maulana Alief|

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (planning date)** 
   -  Plan Discussion

- **[Sprint 1](changelog/sprint-1.md) - (date from 19/11/2020 until 24/11/2020 )** 
   - create a basic user interface 
   - create a snake
   - implement snake movements
   - test out the movements of the snake

- **[Sprint 2](changelog/sprint-2.md) - (24/11/2020 untill 01/12/2020)** 
   - create foods that would be eaten by the snake 
   - make the foods appear randomly 
   - test out the food
   - implement the concept of snake enlarging as it eats more foods
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 3/12/2020 until 8/12/2020)** 
   - implement the rules of the game
   - create the score board
   - implement the restarts and gameovers
   - test out the game
   - bug fixes
   - final check and the game is set

## Running The App

javac SnakeGame.java
java  SnakeGame

## Classes Used

TO;DO

UML image here

## Notable Assumption and Design App Details

Implementasi dari game terkenal yaitu Snake dimana ada seekor ular yang dapat diarahkan untuk memakan buah. Dan jika ular tersebut memakan buah, panjangnya akan bertambah.
Panjang dan tinggi frame aplikasi berukuran 100x100 sel yang dimana satu selnya merupakan persegi dengan ukuran dibebaskan, yang penting sama setiap selnya.
Buah berukuran satu sel dan ditempatkan secara acak.
Jika ular menabrak dinding atau menabrak tubuhnya sendiri, maka game akan selesai.
Ketika game selesai, tunjukan score yang dihitung dari jumlah buah yang dimakan.
Nama main class adalah SnakeGame (Contoh command untuk menjalankan adalah: java SnakeGame).
Kontrol dari game adalah
Tombol-tombol panah untuk mengarahkan ular.
Spasi untuk memulai game.
Ular muncul dengan panjang awal 5 sel dan posisi kepala ada ditengah-tengah area game.
Ular akan mulai bergerak maju setelah pengguna memberikan input dengan menekan tombol spasi.
Dan juga setelah aplikasi dimulai buah pertama akan muncul secara random.
Jika buah termakan oleh ular, maka ular akan bertambah panjangnya pada bagian kepala sebanyak satu sel. Dengan kata lain, pada saat buah dimakan, buah tersebut berubah menjadi kepala baru ular.
Jika game selesai, munculkan dialog baru untuk menampilkan score. Dan jika dialog ditutup, game akan mereset ke posisi awal lagi
