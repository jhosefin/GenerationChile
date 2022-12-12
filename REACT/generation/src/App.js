import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Homepage } from './pages';

const App = () =>{
  return(
    //desde el navegador
    <BrowserRouter>
    {/*vamos a tener distintas rutas*/}
    <Routes>
          {/* Especificamos cada ruta */}
      <Route path='/' element={<Homepage/>} />
      
    </Routes>
    </BrowserRouter>
  )
}

export default App;