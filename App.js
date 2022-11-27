import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Image, View } from 'react-native';
import cloud from './assets/images/cloud.jpg'


export default function App() {
  return (
    <View style={styles.container}>

      <View>
        <Text style={styles.title}>Discover the Weather in your City</Text>
        <Text style={styles.description}> Get to know your weather maps and radar precipitation forecast</Text>
        
        <View style={styles.getting_started_container}>
          <Text style={styles.getting_started}>Get Started</Text>
        </View>

      </View>

  
     
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0B0D20',
    alignItems: 'center',
    justifyContent: 'center',
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
    fontSize: 18,
    lineHeight: 30,
  },

  getting_started_container: {
    backgroundColor: '#0095FF',
    margin: 20,
    borderRadius: 10,


  },

  getting_started: {
    padding:17,
    fontSize: 20,
    marginHorizontal: 100
    
  }

});
