import Header from './Header';
import Content from './Content';
import Footer from './Footer';
import AddItem from './AddItem';
import { useState } from 'react';

function App() {
  const [newItem, setNewItem] = useState('');

  const array = [
    {
      id:1,
      name:"abc",
      game:"xyz"
    },
    {
      id:2,
      name:"abc",
      game:"xyz"
    },
    {
      id:3,
      name:"abc",
      game:"xyz"
    },
    {
      id:4,
      myName:"abc",
      game:"xyz"
    },
  ];

  const style = {
    textAlign: 'center',
    backgroundColor: '#f4f4f4',
    color: '#333',
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(newItem);
    setNewItem('')
  };

  return (
    <div style={style}>
      <Header title='this is title' />
      <AddItem
        newItem={newItem}
        setNewItem={setNewItem}
        handleSubmit={handleSubmit}
      />
      <Content />
      <Footer />
    </div>
  );
}

export default App;
