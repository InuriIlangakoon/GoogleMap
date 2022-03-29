package com.example.googlemap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googlemap.models.UserMap

const val EXTRA_USER_MAP = "EXTRA_USER_MAP"
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvMaps)

        val userMaps = generateSampleData()
        // Set layout manager on the recycler view
        recyclerView.layoutManager = LinearLayoutManager(this)
        //Set adaptor on the recycler view
        recyclerView.adapter = MapsAdapter(this, userMaps, object: MapsAdapter.OnClickListner {
            override fun onItemClick(position: Int) {
                Log.i(TAG, "onItemClick $position")
                //When user taps on view in RV, navigate to new activity
                val intent = Intent(this@MainActivity, DisplayMapActivity::class.java)
                intent.putExtra(EXTRA_USER_MAP, userMaps[position])
                startActivity(intent)
            }

        })


    }

    private fun generateSampleData(): List<UserMap> {
        return listOf(
            UserMap(
                "University of Colombo",
                "University of Colombo",
                6.9000,
                79.8588
            ),
            UserMap(
                "Eastern University",
                "Eastern University, Vantharumoolai",
                7.7944,
                81.5790
            ),
            UserMap(
                "University of Jaffna",
                "University of Jaffna, Jaffna",
                9.6849,
                80.0220
            ),
            UserMap(
                "University of Kelaniya",
                "University of Kelaniya, Kelaniya",
                6.9744,
                79.9161
            ),
            UserMap(
                "University of Moratuwa",
                "University of Moratuwa, Moratuwa",
                6.7951,
                79.9009
            ),
            UserMap(
                "Open University",
                "Open University, Nawala",
                6.8844,
                79.8839
            ),
            UserMap(
                "University of Peradeniya",
                "University of Peradeniya, Peradeniya",
                7.2549,
                80.5974
            ),
            UserMap(
                "Rajarata University",
                "Rajarata University, Mihintale",
                8.3620,
                80.5048
            ),
            UserMap(
                "University of Ruhuna",
                "University of Ruhuna, Matara",
                5.9381,
                80.5761
            ),
            UserMap(
                "Sabaragamuwa University",
                "Sabaragamuwa University, Belihuloya",
                6.7146,
                80.7872
            ),
            UserMap(
                "South Eastern University",
                "South Eastern University, Oluvil",
                7.2970,
                81.8500
            ),
            UserMap(
                "University of Sri Jayawardenepura",
                "University of Sri Jayawardenepura, Sri Jayawardenepura",
                6.8528,
                79.9036
            ),
            UserMap(
                "Uva Wellassa University",
                "Uva Wellassa University, Badulla",
                6.9819,
                81.0763
            ),
            UserMap(
                "Visual and Performing Arts",
                "Visual and Performing Arts, Colombo",
                6.9100,
                79.8625
            ),
            UserMap(
                "Wayamba University",
                "Wayamba University, Kuliyapitiya",
                7.3226,
                79.9882
            ),
            UserMap(
                "Wickramarachchi University",
                "Wickramarachchi University, Yakkala",
                7.0904,
                80.0366
            ),
            UserMap(
                "University of Vauniya",
                "University of Vauniya, Vauniya",
                8.7587,
                80.4107
            ),
        )
    }
}