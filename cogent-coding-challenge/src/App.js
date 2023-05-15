// import logo from './logo.svg';
import { Routes, Route } from 'react-router-dom';
import Home from './components/home';
import Add from './components/add-book';
import Edit from './components/edit-book';
import BookDetails from './components/bok-details';
import './App.css';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route exact path='/' element={<Home/>}/>
        <Route path='/new' element={<Add/>}/>
        <Route path='/edit/:id' element={<Edit/>}/>
        <Route path='/details/:id' element={<BookDetails/>}/>
      </Routes>
    </div>
  );
}

export default App;
