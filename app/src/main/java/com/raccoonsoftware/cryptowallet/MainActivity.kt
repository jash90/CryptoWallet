package com.raccoonsoftware.cryptowallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raccoonsoftware.cryptowallet.api.Endpoints
import com.raccoonsoftware.cryptowallet.api.NetworkService
import com.raccoonsoftware.cryptowallet.models.PriceData
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = NetworkService.buildService(Endpoints::class.java)
        val call = request.getPrice(null)

        call.enqueue(object : Callback<List<PriceData>>{
            override fun onResponse(call: Call<List<PriceData>>, response: Response<List<PriceData>>) {
                if (response.isSuccessful){
                    text.setText(response.body().toString())
                }
            }
            override fun onFailure(call: Call<List<PriceData>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
