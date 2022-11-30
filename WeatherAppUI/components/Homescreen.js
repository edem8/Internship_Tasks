import React from 'react'
import { StatusBar } from 'expo-status-bar';
import cloud from '../assets/images/cloud.png'
import { StyleSheet, Text, Image, View, TouchableOpacity } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';

const Homescreen = ({navigation}) => {
  return (
    <SafeAreaView style={styles.container}>
    <Image source={cloud} style={styles.cloud_image}/>

    <View style={styles.text_container}>
      <Text style={styles.title}>
        Discover the Weather in your City
      </Text>

      <Text style={styles.description}>
        Get to know your weather maps and radar precipitation forecast
      </Text>
      
      <TouchableOpacity 
      style={styles.getting_started_container} 
      onPress={() => navigation.navigate("Weather")}>

        <Text style={styles.getting_started}>Get Started</Text>
      </TouchableOpacity>

    </View>


   
    <StatusBar style="auto" />
  </SafeAreaView>
  )
}

export default Homescreen
const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#0B0D20',
      alignItems: 'center',
      justifyContent: 'center',
    },
  
    cloud_image: {
      width: 250,
      height: 250,
    
    },
  
    text_container:{ 
      marginTop: 20
    },
  
    title: {
      flexDirection: 'column',
      color:'#FBFCFC',
      textAlign:'center',
      fontSize: 22,
      fontWeight:"bold",
      lineHeight: 30,
    
    },
  
    description: {
      flexDirection: 'column',
      paddingTop: 10,
      paddingBottom: 40,
      color:'grey',
      textAlign:'center',
      fontSize: 17,
      lineHeight: 30,
      fontWeight: 'bold',
    },
  
    getting_started_container: {
      backgroundColor: '#0095FF',
      margin: 20,
      marginTop: 120,
      borderRadius: 10,
  
  
    },
  
    getting_started: {
      padding:17,
      fontSize: 20,
      marginHorizontal: 100
      
    }
  
  });