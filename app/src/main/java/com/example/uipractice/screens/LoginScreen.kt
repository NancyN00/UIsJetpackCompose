package com.example.uipractice.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uipractice.R
import com.example.uipractice.components.CheckBoxField
import com.example.uipractice.components.InputField
import com.example.uipractice.components.RowButtonField
import com.example.uipractice.components.TextField

@Composable
fun LoginScreen(
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) ->Unit,

) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center,
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            title = stringResource(R.string.log_in),
                    textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(20.dp))

        InputField(
            value = email ,
            placeholder = "Email",
            onValueChange =  onEmailChange,
            leadingIcon = {
               Icon(Icons.Default.Email, contentDescription = "Email", tint = MaterialTheme.colorScheme.primary)
            })

        Spacer(modifier = Modifier.height(15.dp))

        InputField(
            value = password ,
            placeholder = "Password",
            onValueChange =  onPasswordChange,
            leadingIcon = {
                Icon(
                    Icons.Default.Password, contentDescription = "Password", tint = MaterialTheme.colorScheme.primary)
            })

        Spacer(modifier = Modifier.height(15.dp))

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            CheckBoxField(title = stringResource(R.string.remember_me) , isChecked = isChecked, onCheckChange = {isChecked = it} )

            Spacer(modifier = Modifier.weight(10f))
            
            Text(
                text = stringResource(R.string.forgot_password),
                        textAlign = TextAlign.End,
                        color = Color.Red)
        }

        Spacer(modifier = Modifier.height(20.dp))
        
        RowButtonField(title = stringResource(R.string.log_in_with_your_account)) {}

        Spacer(modifier = Modifier.height(20.dp))

        TextField(title = stringResource(R.string.log_in_with), textAlign = TextAlign.Start)

        Spacer(modifier = Modifier.height(50.dp))

        Row() {
            
            RowButtonField(title = stringResource(R.string.f_facebook)) {}

           Spacer(modifier = Modifier.weight(0.3f))

            RowButtonField(title = stringResource(R.string.g_google)) {}
        }

        Spacer(modifier = Modifier.height(150.dp))

        RowButtonField(title = "New user? Create account") {}


    }

}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen(onEmailChange = {}, onPasswordChange = {})
}