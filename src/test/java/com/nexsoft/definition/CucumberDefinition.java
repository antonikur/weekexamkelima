package com.nexsoft.definition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.nexsoft.pom.OneListPom;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class CucumberDefinition {
	public AndroidDriver driver;
	public DesiredCapabilities capabilities;
	public Tools tool = new Tools();
	public OneListPom oneList;
	//👤
	
	@Before
	public void initial() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		
		
	}
	
	public void prepare() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		oneList = new OneListPom(driver);
	}
	
	//Given=========================================================
	@Given ("^Tekan tombol add list$")
	public void tekanTombolAddList()throws Throwable {
		prepare();
		oneList.btnAddList.click();
	}
	
	@Given ("^Tekan dan tahan list  yang sudah dibuat$")
	public void tekanDanTahanListYangSudahDibuat()throws Throwable {
		prepare();
		oneList.clickAndHoldListOnTitleContain("TODO");
	}
	
	@Given ("^Pilih list yang sudah dibuat$")
	public void pilihListYangSudahDibuat()throws Throwable {
		prepare();
		oneList.clickListOnTitleContain("TODO");
	}
	
	
	//And=========================================================
	@And ("^Input nama baru di pop up edit list$")
	public void inputNamaBaruDiPopUpEditList()throws Throwable {
		oneList.fieldListName.clear();
		oneList.fieldListName.sendKeys("list dummy");
	}
	@And ("^Tekan tombol centang di pop up edit list$")
	public void tekanTombolCentangDiPopUpEditList()throws Throwable {
		oneList.btnEditListCentang.click();
	}
	@And ("^Tekan tombol silang di pop up edit list$")
	public void tekanTombolSilangDiPopUpEditList()throws Throwable {
		oneList.btnEditListSilang.click();
	}
	@And ("^Tekan tombol silang di pop up konfirm delete$")
	public void tekanTombolSilangDiPopUpKonfirmDelete()throws Throwable {
		oneList.btnSilangConfirmDelete.click();
	}
	@And ("^Tekan tombol centang di pop up konfirm delete$")
	public void tekanTombolCentangDiPopUpKonfirmDelete()throws Throwable {
		oneList.btnCentangConfirmDelete.click();
	}
	@And ("^Tekan tombol just clear list di pop up konfirm delete$")
	public void tekanTombolJustClearListDiPopUpKonfirmDelete()throws Throwable {
		oneList.btnJustClearList.click();
	}

	@And ("^Tekan tombol panah di bawah field Add$")
	public void tekanTombolPanahDiBawahFieldAdd()throws Throwable {
		oneList.btnArrowComment.click();
	}

	@And ("^tekan tombol centang di add$")
	public void tekanTombolCentangDiAdd()throws Throwable {
		oneList.btnFieldAddCentang.click();
	}

	@And ("^Input field comment valid$")
	public void inputFieldCommentValid()throws Throwable {
		oneList.fieldComment.clear();
		oneList.fieldComment.sendKeys("comt dummy");
	}

	@And ("^Tekan tombol silang di comment$")
	public void tekanTombolSilangDiComment()throws Throwable {
		oneList.btnFieldCommentClear.click();
	}

	@And ("^Input field comment unique char$")
	public void inputFieldCommentUniqueChar()throws Throwable {
		oneList.fieldComment.clear();
		oneList.fieldComment.sendKeys("👤!@#!#$Adad");
	}

	@And ("^Input add dan comment baru valid$")
	public void inputAddDanCommentBaruValid()throws Throwable {
		oneList.fieldAdd.clear();
		oneList.fieldAdd.sendKeys("add dummy");
		oneList.fieldComment.clear();
		oneList.fieldComment.sendKeys("comt dummy");
	}

	@And ("^Tekan tombol centang di edit add$")
	public void tekanTombolCentangDiEditAdd()throws Throwable {
		oneList.btnCentangEditAdd.click();
	}

	@And ("^Tekan tombol silang di edit add$")
	public void tekanTombolSilangDiEditAdd()throws Throwable {
		oneList.btnSilangEditAdd.click();
	}

	@And ("^Klik lagi add yang sudah di klik tadi di bagian bawah$")
	public void klikLagiAddYangSudahDiKlikTadiDiBagianBawah()throws Throwable {
		
	}

	@And ("^Tekan centang di add list$")
	public void tekanCentangDiAddList()throws Throwable {
		oneList.btnNewListCentang.click();
	}

	@And ("^Tekan silang di add list$")
	public void tekanSilangDiAddList()throws Throwable {
		oneList.btnNewListCancel.click();
	}

	@And ("^Tekan tombol import di menu more options$")
	public void tekanTombolImportDiMenuMoreOptions()throws Throwable {
		oneList.btnMoreOptionImport.click();
	}

	@And ("^Tekan tombol app private storage di menu more options$")
	public void tekanTombolAppPrivateStorageDiMenuMoreOptions()throws Throwable {
		oneList.btnMoreOptionAppPrivateStorage.click();
	}
	
	
	//When=========================================================
	@When ("^Tekan tombol edit di kanan atas layar$")
	public void tekanTombolEditDiKananAtasLayar()throws Throwable {
		oneList.btnEditList.click();
	}

	@When ("^Tekan tombol delete di kanan atas layar$")
	public void tekanTombolDeleteDiKananAtasLayar()throws Throwable {
		oneList.btnDeleteList.click();
	}

	@When ("^Input field add valid$")
	public void inputFieldAddValid()throws Throwable {
		oneList.fieldAdd.clear();
		oneList.fieldAdd.sendKeys("add dummy");
	}

	@When ("^Input field add unique char$")
	public void inputFieldAddUniqueChar()throws Throwable {
		oneList.fieldAdd.clear();
		oneList.fieldAdd.sendKeys("👤!@#!#$Adad");
	}

	@When ("^Klik add yang sudah dibuat$")
	public void klikAddYangSudahDibuat()throws Throwable {
		oneList.clickAddInIndex(1);
	}

	@When ("^Swipe add yang sudah di buat dari kiri ke kanan$")
	public void swipeAddYangSudahDibuatDariKiriKeKanan()throws Throwable {
		oneList.swipeFirstAdd();
	}

	@When ("^Swipe add yang sudah di buat dari kanan ke kiri$")
	public void swipeAddYangSudahDiBuatDariKananKeKiri()throws Throwable {
		
	}

	@When ("^Tekan dan tahan add kemudian diswipe kebawah$")
	public void tekanDanTahanAddKemudianDiswipeKebawah()throws Throwable {
		oneList.clickAndHoldListOnTitleContain("TODO");
	}

	@When ("^Input field List valid$")
	public void inputFieldListValid()throws Throwable {
		oneList.fieldListName.clear();
		oneList.fieldListName.sendKeys("list dummy");
		
	}

	@When ("^Input field List unique char$")
	public void inputFieldListUniqueChar()throws Throwable {
		oneList.fieldListName.clear();
		oneList.fieldListName.sendKeys("👤!@#!#$Adad");
	}

	@When ("^Tekan tombol more options di list$")
	public void tekanTombolMoreOptionsDiList()throws Throwable {
		oneList.btnMoreOption.click();
	}


	//Then======================================================
	@Then ("^Keluar pop up untuk edit nama List$")
	public void keluarPopUpUntukEditNamaList()throws Throwable {
		try {
			oneList.fieldEditAddName.click();
		} catch (Exception e) {
			fail("Element in pop up not found");
		}
	}

	@Then ("^Nama List berubah sesuai yang baru diinput$")
	public void namaListBerubahSesuaiYangBaruDiinput()throws Throwable {
		String result = oneList.fieldListName.getAttribute("text");
		assertEquals("list dummy", result);
	}

	@Then ("^Keluar pop up untuk input List Name baru$")
	public void keluarPopUpUntukInputListNameBaru()throws Throwable {
		try {
			oneList.fieldListName.click();
		} catch (Exception e) {
			fail("Element di pop up tidak ditemukan");
		}
	}

	@Then ("^Tab baru terbuat dengan nama sesuai yang di input$")
	public void tabBaruTerbuatDenganNamaSesuaiYangDiInput()throws Throwable {
		
	}

	@Then ("^Tab baru tidak terbuat$")
	public void tabBaruTidakTerbuat()throws Throwable {
	}

	@Then ("^Keluar menu baru$")
	public void keluarMenuBaru()throws Throwable {
	}

	@Then ("^Keluar pop up baru mengenai allow access folder atau ke aplikasi file manager$")
	public void keluarPopUpBaruMengenaiAllowAccessFolderAtauKeAplikasiFileManager()throws Throwable {
	}

	@Then ("^Keluar pop up baru yaitu change list storage folder$")
	public void keluarPopUpBaruYaituChangeListStorageFolder()throws Throwable {
	}

	@Then ("^Keluar tombol edit dan delete di atas kanan layar$")
	public void keluarTombolEditDanDeleteDiAtasKananLayar()throws Throwable {
	}

	@Then ("^Nama List tidak berubah$")
	public void namaListTidakBerubah()throws Throwable {
	}

	@Then ("^Keluar pop up untuk konfirmasi delete List$")
	public void keluarPopUpUntukKonfirmasiDeleteList()throws Throwable {
	}

	@Then ("^List tidak jadi di delete$")
	public void listTidakJadiDiDelete()throws Throwable {
	}

	@Then ("^List ter delete$")
	public void listTerDelete()throws Throwable {
	}

	@Then ("^List tidak ter delete, tapi semua add dari list ter delete$")
	public void listTidakTerDeleteTapiSemuaAddDariListTerDelete()throws Throwable {
	}

	@Then ("^Keluar pop up field comment dari add$")
	public void keluarPopUpFieldCommentDariAdd()throws Throwable {
	}

	@Then ("^Add baru terbuat dengan nama sesuai yang di input$")
	public void addBaruTerbuatDenganNamaSesuaiYangDiInput()throws Throwable {
	}

	@Then ("^Comment terbuat bersama add dengan input yang sama$")
	public void commentTerbuatBersamaAddDenganInputYangSama()throws Throwable {
	}

	@Then ("^Input comment di hapus$")
	public void inputCommentDiHapus()throws Throwable {
	}

	@Then ("^List menjadi pudar atau dicoret, dan di kebawahkan$")
	public void listMenjadiPudarAtauDicoretDanDiKebawahkan()throws Throwable {
	}

	@Then ("^Keluar pop up untuk edit nama add dan comment nya$")
	public void keluarPopUpUntukEditNamaAddDanCommentNya()throws Throwable {
	}

	@Then ("^Inputan di simpan sesuai dari yang edit$")
	public void inputanDiSimpanSesuaiDariYangEdit()throws Throwable {
	}

	@Then ("^Inputan tidak di simpan dari yang di edit$")
	public void inputanTidakDiSimpanDariYangDiEdit()throws Throwable {
	}

	@Then ("^Add dihapus$")
	public void addDihapus()throws Throwable {
	}

	@Then ("^Add tersebut pindah posisi sesuai dengan yang kita drag$")
	public void addTersebutPindahPosisiSesuaiDenganYangKitaDrag()throws Throwable {
	}

	@Then ("^Add menjadi tidak dicoret atau pudar dan posisinya naik ke atas$")
	public void addMenjadiTidakDicoretAtauPudarDanPosisinyaNaikKeAtas()throws Throwable {
	}
	
	    

/*
//Given



//@When

//@And


//@Then


 */

	    
	    
	    

	    
	    
}
