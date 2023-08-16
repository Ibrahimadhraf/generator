package com.example.host_basedcardemulation

import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.host_basedcardemulation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private var nfcAdapter: NfcAdapter? = null
//   lateinit var  textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
      //  nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // textView=findViewById(R.id.myTextView);

        // Kotlin code to interact with UI components and backend services
        // ...
    }

//    public override fun onResume() {
//        super.onResume()
//        nfcAdapter?.enableReaderMode(this, this,
//            NfcAdapter.FLAG_READER_NFC_A or
//                    NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
//            null)
//    }
//    public override fun onPause() {
//        super.onPause()
//        nfcAdapter?.disableReaderMode(this)
//    }
//    override fun onTagDiscovered(tag: Tag?) {
//        val isoDep = IsoDep.get(tag)
//        isoDep.connect()
//        val response = isoDep.transceive(Utils.hexStringToByteArray(
//            "00A4040007A0000002471001"))
//        runOnUiThread { textView.setText("\nCard Response: "
//                + Utils.toHex(response)) }
//        isoDep.close()
//    }

}