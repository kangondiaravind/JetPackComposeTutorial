package com.arra.JetPackComposeTutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arra.JetPackComposeTutorial.ui.theme.GreenJC
import com.arra.JetPackComposeTutorial.ui.theme.JetPackComposeTutorial
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arra.JetPackComposeTutorial.Activities.Home
import com.arra.JetPackComposeTutorial.Activities.Notification
import com.arra.JetPackComposeTutorial.Activities.Profile
import com.arra.JetPackComposeTutorial.Activities.Settings.Settings
import com.arra.JetPackComposeTutorial.Activities.CreateReels
import com.arra.JetPackComposeTutorial.ui.theme.Screens
import com.arra.JetPackComposeTutorial.Activities.Search
import com.arra.JetPackComposeTutorial.Activities.PostScreen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeTutorial(darkTheme = false) {
                Surface(
                    //modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    //LearnModifier()
                    // BoxLayoutExample()/
                    //BoxArrangementAndAlignmentLearn()ƒ
                    //LearnButton()
                    //LearnImage()
                    //LearnState()
                    //LearnTopAppBar()
                    //Settings()
                    //LearnNavigationDrawer()
                    //LearnBottomAppBar()
                    LearnNavigationMenuWithBottomSheet()

                }
            }
        }
    }
}

@Composable
fun LearnRowColumnBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding(),
        contentAlignment = Alignment.BottomEnd
    ) {
        Text(text = "Hello World")
        Text(text = "Hello World")
        Text(text = "Hello World")
    }
}


@Composable
fun BoxLayoutExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "Hello World",
                modifier = Modifier.align(Alignment.Center),
                color = Color.Black,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun BoxArrangementAndAlignmentLearn() {
    //safeContentPadding or safeDrawingPadding (To Avoid Overlap)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding(), contentAlignment = Alignment.Center
    ) {
        Text(text = "TopStart", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "TopCenter", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "TopEnd", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "Center", modifier = Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun LearnButton() {
    val context = LocalContext.current.applicationContext
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Button(
            onClick = { Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show() },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
            Text(text = "perform click")
        }
    }
}

@Composable
fun LearnImage() {
    Image(
        painter = painterResource(id = R.drawable.jetpack_compose_logo),
        contentDescription = "Jetpack Compose Image"
    )
}

@Composable
fun LearnState() {
    //var age = 0
    var age by rememberSaveable() {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.safeDrawingPadding()) {
        Button(onClick = {
            age++
            Log.d("MainActivity", "Age: ${age}")
        }) {
            Text(text = "I am ${age} years old")
        }
    }
}


//To Display TopAppBar comment below line in surface of the MainActivity
//modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnTopAppBar() {
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text("Whats App") },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "Navigation Clicked",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Image(
                    painter = painterResource(id = R.drawable.jetpack_compose_logo),
                    contentDescription = "Menu Icon"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            GreenJC,
            navigationIconContentColor = Color.White,
            titleContentColor = Color.White
        ),

        actions = {
            IconButton(
                onClick = { Toast.makeText(context, "Profile Clicked", Toast.LENGTH_SHORT).show() },
            ) {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "Profile",
                )
            }
            IconButton(
                onClick = { Toast.makeText(context, "Search Clicked", Toast.LENGTH_SHORT).show() },
            ) {
                Icon(
                    imageVector = Icons.Filled.Search, contentDescription = "Search",
                )
            }
            IconButton(
                onClick = { Toast.makeText(context, "More Clicked", Toast.LENGTH_SHORT).show() },
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert, contentDescription = "More",
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LearnNavigationDrawer() {

    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(drawerContent = {
        ModalDrawerSheet(drawerContainerColor = GreenJC, drawerContentColor = Color.White) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(GreenJC)
                    .height(150.dp)
            ) {
                Text("Text")
            }
            Divider()
            NavigationDrawerItem(
                label = { Text("Home", color = Color.White) },
                selected = false,
                icon = {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Home",
                        tint = Color.White
                    )
                },
                onClick = {
                    coroutineScope.launch {
                        drawerState.close()
                    }
                    navController.navigate(Screens.Home.screen) {
                        popUpTo(0)
                    }
                },
            )
            NavigationDrawerItem(
                label = { Text("Profile", color = Color.White) },
                selected = false,
                icon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Profile",
                        tint = Color.White
                    )
                },
                onClick = {
                    coroutineScope.launch {
                        drawerState.close()
                    }
                    navController.navigate(Screens.Profile.screen) {
                        popUpTo(0)
                    }
                },
            )
            NavigationDrawerItem(
                label = { Text("Settings", color = Color.White) },
                selected = false,
                icon = {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "Settings",
                        tint = Color.White
                    )
                },
                onClick = {
                    Toast.makeText(
                        context,
                        "Settings Clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                },
            )
        }
    }, drawerState = drawerState) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Navigation") },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Menu",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        GreenJC,
                        navigationIconContentColor = Color.White,
                        titleContentColor = Color.White
                    ),
                )
            }
        ) {
            NavHost(navController = navController, startDestination = Screens.Home.screen) {
                composable(Screens.Home.screen) {
                    Home()
                }
                composable(Screens.Profile.screen) {
                    Profile()
                }
                composable(Screens.Settings.screen) {
                    Settings()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LearnBottomAppBar() {

    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current.applicationContext
    val selected = remember { mutableStateOf(Icons.Default.Home) }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }


    Scaffold(bottomBar = {
        BottomAppBar(containerColor = GreenJC) {
            IconButton(onClick = {
                selected.value = Icons.Default.Home
                navController.navigate(Screens.Home.screen) {
                    popUpTo(0)
                }
            }, modifier = Modifier.weight(1f)) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home ",
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray
                )
            }
            IconButton(onClick = {
                selected.value = Icons.Default.Search
                navController.navigate(Screens.Search.screen) {
                    popUpTo(0)
                }
            }, modifier = Modifier.weight(1f)) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Default.Search) Color.White else Color.DarkGray
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                FloatingActionButton(
                    onClick = { showBottomSheet = true }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                        tint = Color.White
                    )
                }
            }
            IconButton(onClick = {
                selected.value = Icons.Default.Notifications
                navController.navigate(Screens.Notification.screen) {
                    popUpTo(0)
                }
            }, modifier = Modifier.weight(1f)) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications",
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Default.Notifications) Color.White else Color.DarkGray
                )
            }
            IconButton(onClick = {
                selected.value = Icons.Default.Person
                navController.navigate(Screens.Profile.screen) {
                    popUpTo(0)
                }
            }, modifier = Modifier.weight(1f)) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile",
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Default.Person) Color.White else Color.DarkGray
                )
            }
        }
    }) {
        NavHost(
            navController = navController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(it)
        ) {
            composable(Screens.Home.screen) {
                Home()
            }
            composable(Screens.Search.screen) {
                Search()
            }
            composable(Screens.Notification.screen) {
                Notification()
            }
            composable(Screens.Profile.screen) {
                Profile()
            }
            composable(Screens.PostScreen.screen) {
                PostScreen()
            }
            composable(Screens.CreateReels.screen) {
                CreateReels()
            }
        }
        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = { showBottomSheet = false },
                sheetState = sheetState
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    BottomSheetItems(Icons.Default.ThumbUp, "Create Item") {
                        showBottomSheet = false
                        navController.navigate(Screens.PostScreen.screen) {
                            popUpTo(0)
                        }
                    }
                    BottomSheetItems(Icons.Default.PlayArrow, "Create Reels") {
                        showBottomSheet = false
                        navController.navigate(Screens.CreateReels.screen) {
                            popUpTo(0)
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun BottomSheetItems(icon: ImageVector, title: String, onclick: () -> Unit) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onclick() },
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = GreenJC
        )
        Text(text = title, color = Color.Black, fontSize = 22.sp)
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnNavigationMenuWithBottomSheet() {

    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    val selected = remember { mutableStateOf(Icons.Default.Home) }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(GreenJC)
                        .height(150.dp)
                ) {
                    Text("Text")
                }
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Home", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Home",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(
                    label = { Text(text = "Profile", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Profile",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Screens.Profile.screen) {
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(
                    label = { Text(text = "Settings", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = "Settings",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Screens.Settings.screen) {
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(
                    label = { Text(text = "Logout", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Logout,
                            contentDescription = "Logout",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                    })
            }
        },
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Navigation") },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Menu",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        GreenJC,
                        navigationIconContentColor = Color.White,
                        titleContentColor = Color.White
                    ),
                )
            },
            bottomBar = {
                BottomAppBar(containerColor = GreenJC) {
                    IconButton(onClick = {
                        selected.value = Icons.Default.Home
                        navController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home ",
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray
                        )
                    }
                    IconButton(onClick = {
                        selected.value = Icons.Default.Search
                        navController.navigate(Screens.Search.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Search) Color.White else Color.DarkGray
                        )
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        FloatingActionButton(
                            onClick = { showBottomSheet = true }) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add",
                                tint = Color.White
                            )
                        }
                    }
                    IconButton(onClick = {
                        selected.value = Icons.Default.Notifications
                        navController.navigate(Screens.Notification.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notifications",
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Notifications) Color.White else Color.DarkGray
                        )
                    }
                    IconButton(onClick = {
                        selected.value = Icons.Default.Person
                        navController.navigate(Screens.Profile.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Person) Color.White else Color.DarkGray
                        )
                    }
                }
            }
        ) {
            NavHost(
                navController = navController,
                startDestination = Screens.Home.screen,
                modifier = Modifier.padding(it)
            ) {
                composable(Screens.Home.screen) {
                    Home()
                }
                composable(Screens.Search.screen) {
                    Search()
                }
                composable(Screens.Notification.screen) {
                    Notification()
                }
                composable(Screens.Profile.screen) {
                    Profile()
                }
                composable(Screens.PostScreen.screen) {
                    PostScreen()
                }
                composable(Screens.CreateReels.screen) {
                    CreateReels()
                }
                composable(Screens.Settings.screen) {
                    Settings()
                }
            }
            if (showBottomSheet) {
                ModalBottomSheet(
                    onDismissRequest = { showBottomSheet = false },
                    sheetState = sheetState
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp),
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        BottomSheetItems(Icons.Default.ThumbUp, "Create a Post") {
                            showBottomSheet = false
                            Toast.makeText(context, "Navigated to Post Screen", Toast.LENGTH_SHORT).show()
                            navController.navigate(Screens.PostScreen.screen) {
                                popUpTo(0)
                            }
                        }
                        BottomSheetItems(Icons.Default.Star, "Add a Story") {
                            showBottomSheet = false
                            Toast.makeText(context, "Add a Story Clicked", Toast.LENGTH_SHORT).show()
                        }
                        BottomSheetItems(Icons.Default.PlayArrow, "Create a Reel") {
                            showBottomSheet = false
                            Toast.makeText(context, "Create a Reel Clicked", Toast.LENGTH_SHORT).show()
                            navController.navigate(Screens.CreateReels.screen) {
                                popUpTo(0)
                            }
                        }
                        BottomSheetItems(Icons.Default.Camera, "Go Live") {
                            showBottomSheet = false
                            Toast.makeText(context, "Go Live clicked", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun LoginScreen(loginSuccess: () ->Unit) {

    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val context = LocalContext.current.applicationContext

    Column() {
        OutlinedTextField(
            value = username.value,
            onValueChange = { username.value = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth().padding(16.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivityPreview() {
    JetPackComposeTutorial {
        LearnNavigationMenuWithBottomSheet()
    }
}

