package net.secure.comc.ui.screens

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun LoginUI() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor =
            //if (isSelected) MaterialTheme.colorScheme.primaryContainer
            //else
                MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Text(
            text = "Login",
        style = MaterialTheme.typography.bodyLarge,
        color =
            //if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer
            //else
            MaterialTheme.colorScheme.onSurface, )

    }

}
