package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomsiswa.halaman.DestinasiEntry
import com.example.roomsiswa.halaman.DestinasiHome
import com.example.roomsiswa.halaman.EntrySiswaScreen
import com.example.roomsiswa.halaman.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()) {
    HostNavigasi(navController = navController)

}
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = Modifier) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) })
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}