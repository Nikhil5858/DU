import './App.css';
import Product from './Product';
import Faculties from './Faculties';
import MyNavbar from './MyNavbar';
import {BrowserRouter , Routes, Route} from 'react-router-dom';
import Student from './Student';

function App() {
  return (
    <>
        <BrowserRouter>
          <MyNavbar></MyNavbar>
            <Routes>
              <Route path='/' element={<Faculties/>}></Route>
              <Route path='/products' element={<Product/>}></Route>
              <Route path='/students' element={<Student/>}></Route>
            </Routes>
        </BrowserRouter>
    </>
  );
}

export default App;
