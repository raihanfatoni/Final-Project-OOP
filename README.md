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

- Buka terminal
- CD folder tugas projekan
- Complile semua file yang ada di folder [javac *.java]
- Run progran [java SnakeGame]
- Mulai Gim Oray

## Classes Used

* SnakeGame sebagai main class
* GameFrame sebagai class untuk membuat board/frame
* GamePanel sebagai class untuk menampilkan objek - objek yang ada di dalam board dan prosesnya


![alt text](https://github.com/raihanfatoni/Final-Project-OOP/blob/master/images/UML-2.jpg?raw=true)

## Notable Assumption and Design App Details
- Gim Oray adalah implementasi dari Snake Game yang mana tujuan utama dari permainan adalah mengarahkan ular untuk memakan buah yang mana tiap buah dimakan akan menambah score beserta panjang ular tersebut
- Panjang dan lebar panel adalah 600x600 dengan rasio grid panel adalah 100x100.
- Buah berukuran 1 petak.
- Permainan berakhir ketika ular menabrak batas panel(atas,bawah,kanan,kiri) atau menabrak badannya sendiri
- Diakhir permainan akan ditampilkan Score
- Untuk menjalankan App Gim Oray adalah run dengan command sebagai berikut "java SnakeGame" jika baru pertama kali maka compile seluruh file terlebih dahulu dengan command "javac *.java" jika anda menggunakan VSCode bisa run App pada terminal yang tersedia namun jika menggunakan editor teks lain anda bisa run dengan melakukan "cmd" pada folder tempat file anda disimpan
- Pada awal game panjang ular adalh 5 dan posisi ular pada tengah panel (koordinat(300,300))
- Untuk memulai permainan tekan tombol space
- Diakhir permainan pemain dapat melakukan restart dengan menekan tombol space
