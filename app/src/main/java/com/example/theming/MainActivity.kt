package com.example.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theming.ui.theme.ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Theming(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Theming(modifier: Modifier = Modifier) {
    val appModifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Theming Walkthrough",
            modifier = appModifier,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appModifier
        )
        Button(
            onClick = {},
            modifier = appModifier
        ) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThemingPreview() {
    ThemingTheme {
        Theming()
    }
}