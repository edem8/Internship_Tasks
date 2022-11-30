import { NavigationContainer } from '@react-navigation/native';
import * as React from 'react';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Homescreen from './components/Homescreen';
import Weatherscreen from './components/Weatherscreen';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>

      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Homescreen} options={{headerShown: false}} />
        <Stack.Screen name="Weather" component={Weatherscreen} options={{headerShown: false}}/>
      </Stack.Navigator>

    </NavigationContainer>
  );
}


