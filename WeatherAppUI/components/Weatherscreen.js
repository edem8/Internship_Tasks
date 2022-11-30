import React from 'react'
import { Button, View, Text, } from 'react-native'
import { SafeAreaView } from 'react-native-safe-area-context'

const Weatherscreen = ({navigation}) => {
  return (
    <SafeAreaView>
      <Button title="Go back" onPress={() => navigation.goBack()} /> 
     
    </SafeAreaView>
  )
}

export default Weatherscreen
