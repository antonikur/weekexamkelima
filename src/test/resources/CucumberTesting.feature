#Author: Antoni Kurniawan
Feature: Test List, Add, dan Comment

  Scenario: Tap tombol add di atas kanan
    Given Tekan tombol add list
    Then Keluar pop up untuk input List Name baru

  Scenario: Input List Name dan tekan tombol centang, list: List Dummy
    Given Tekan tombol add list
    When Input field List valid
    And Tekan centang di add list
    Then Tab baru terbuat dengan nama sesuai yang di input

  Scenario: Input List Name dan tekan tombol silang, list: List Dummy
    Given Tekan tombol add list
    When Input field List valid
    And Tekan silang di add list
    Then Tab baru tidak terbuat

  Scenario: Input simbol dan unique character lainnya di field list, list: (unique char)!@#!#$Adad
    Given Tekan tombol add list
    When Input field List unique char
    And Tekan centang di add list
    Then Tab baru terbuat dengan nama sesuai yang di input

  Scenario: Pop up Add List, tekan tombol more options
    Given Tekan tombol add list
    When Tekan tombol more options di list
    Then Keluar menu baru

  Scenario: Pop up Add List, tekan pilihan import di more options
    Given Tekan tombol add list
    When Tekan tombol more options di list
    And Tekan tombol import di menu more options
    Then Keluar pop up baru mengenai allow access folder atau ke aplikasi file manager

  Scenario: Pop up Add List, tekan pilihan app private storage di more options
    Given Tekan tombol add list
    When Tekan tombol more options di list
    And Tekan tombol app private storage di menu more options
    Then Keluar pop up baru yaitu change list storage folder

  Scenario: Tekan dan tahan List
    Given Tekan dan tahan list  yang sudah dibuat
    Then Keluar tombol edit dan delete di atas kanan layar

  Scenario: Tekan tombol edit dari List
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol edit di kanan atas layar
    Then Keluar pop up untuk edit nama List

  Scenario: Pop up edit List, input nama baru dan tekan tombol centang
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol edit di kanan atas layar
    And Input nama baru di pop up edit list
    And Tekan tombol centang di pop up edit list
    Then Nama List berubah sesuai yang baru diinput

  Scenario: Pop up edit List, input nama baru dan tekan tombol silang
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol edit di kanan atas layar
    And Input nama baru di pop up edit list
    And Tekan tombol silang di pop up edit list
    Then Nama List tidak berubah

  Scenario: Tekan tombol delete dari List
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol delete di kanan atas layar
    Then Keluar pop up untuk konfirmasi delete List

  Scenario: Pop up delete List, tekan tombol centang
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol delete di kanan atas layar
    And Tekan tombol silang di pop up konfirm delete
    Then List tidak jadi di delete

  Scenario: Pop up delete List, tekan tombol silang
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol delete di kanan atas layar
    And Tekan tombol centang di pop up konfirm delete
    Then List ter delete

  Scenario: Pop up delete List, tekan tombol just clear list
    Given Tekan dan tahan list  yang sudah dibuat
    When Tekan tombol delete di kanan atas layar
    And Tekan tombol just clear list di pop up konfirm delete
    Then List tidak ter delete, tapi semua add dari list ter delete

  Scenario: Tap tombol panah di bawah field add
    Given Pilih list yang sudah dibuat
    And Tekan tombol panah di bawah field Add
    Then Keluar pop up field comment dari add

  Scenario: Input field add dan tekan tombol centang, add: add dummy
    Given Pilih list yang sudah dibuat
    When Input field add valid
    And tekan tombol centang di add
    Then Add baru terbuat dengan nama sesuai yang di input

  Scenario: Input field comment dan tekan tombol centang di add, add: add dummy, comt: comt dummy
    Given Pilih list yang sudah dibuat
    When Input field add valid
    And Tekan tombol panah di bawah field Add
    And Input field comment valid 
    And tekan tombol centang di add
    Then Comment terbuat bersama add dengan input yang sama

  Scenario: Input field comment dan tekan tombol silang di comment, comt: comt dummy
    Given Pilih list yang sudah dibuat
    And Tekan tombol panah di bawah field Add
    And Input field comment valid
    And Tekan tombol silang di comment
    Then Input comment di hapus

  Scenario: Input simbol dan unique character lainnya di field add, add: (unique char)!@#!#$Adad
    Given Pilih list yang sudah dibuat
    When Input field add unique char
    And tekan tombol centang di add
    Then Add baru terbuat dengan nama sesuai yang di input

  Scenario: Input simbol dan unique character lainnya di field comment, add: (unique char)!@#!#$Adad, comt: (unique char)!@#!#$Adad
    Given Pilih list yang sudah dibuat
    When Input field add unique char
    And Tekan tombol panah di bawah field Add
    And Input field comment unique char 
    And tekan tombol centang di add
    Then Comment terbuat bersama add dengan input yang sama

  Scenario: Tap Add yang sudah dibuat
    Given Pilih list yang sudah dibuat
    When Klik add yang sudah dibuat
    Then List menjadi pudar atau dicoret, dan di kebawahkan

  Scenario: Swipe Add dari kiri ke kanan
    Given Pilih list yang sudah dibuat 
    When Swipe add yang sudah di buat dari kiri ke kanan
    Then Keluar pop up untuk edit nama add dan comment nya

  Scenario: Edit nama Add, Comment yang dibuat dan tekan centang, add: edit add, comt: edit comnt
    Given Pilih list yang sudah dibuat 
    When Swipe add yang sudah di buat dari kiri ke kanan
    And Input add dan comment baru valid
    And Tekan tombol centang di edit add
    Then Inputan di simpan sesuai dari yang edit

  Scenario: Edit nama Add, Comment yang dibuat dan tekan silang, add: edit add, comt: edit comnt
    Given Pilih list yang sudah dibuat 
    When Swipe add yang sudah di buat dari kiri ke kanan
    And Input add dan comment baru valid
    And Tekan tombol silang di edit add
    Then Inputan tidak di simpan dari yang di edit

  Scenario: Swipe Add dari kanan ke kiri
    Given Pilih list yang sudah dibuat 
    When Swipe add yang sudah di buat dari kanan ke kiri
    Then Add dihapus

  Scenario: Tekan dan tahan add kemudian swipe kebawah
    Given Pilih list yang sudah dibuat 
    When Tekan dan tahan add kemudian diswipe kebawah
    Then Add tersebut pindah posisi sesuai dengan yang kita drag

  Scenario: Tap add yang di coret atau dipudarkan
    Given Pilih list yang sudah dibuat
    When Klik add yang sudah dibuat
    And Klik lagi add yang sudah di klik tadi di bagian bawah
    Then Add menjadi tidak dicoret atau pudar dan posisinya naik ke atas
