package com.example.supportallscreensizescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supportallscreensizescompose.ui.theme.SupportAllScreenSizesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SupportAllScreenSizesComposeTheme {
                val windowInfo = rememberWindowInfo()
                if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact){
                LazyColumn(modifier = Modifier.fillMaxSize()){
                  //list1
                  items(10){
                      Text(
                          text = "Item $it",
                          fontSize = 26.sp,
                          modifier = Modifier
                              .fillMaxWidth()
                              .background(Color.Cyan)
                              .padding(16.dp)
                      )

                  }
                  //list2
                  items(10){
                      Text(
                          text = "Item $it",
                          fontSize = 26.sp,
                          modifier = Modifier
                              .fillMaxWidth()
                              .background(Color.Green)
                              .padding(16.dp)
                      )

                  }
                }
            } else{
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    LazyColumn(modifier = Modifier.weight(1f)){
                        //list1
                        items(10){
                            Text(
                                text = "Item $it",
                                fontSize = 26.sp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.Cyan)
                                    .padding(16.dp)
                            )

                        }
                    }
                    LazyColumn(modifier = Modifier.weight(1f)){
                        //list1
                        items(10){
                            Text(
                                text = "Item $it",
                                fontSize = 26.sp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.Green)
                                    .padding(16.dp)
                            )

                        }
                    }
                }
            }
            }
        }
    }
}

