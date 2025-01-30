import Header from './Header'
import Content from './Content'
import Footer from './Footer'

function App() {

  const style = {
    textAlign: 'center',
    backgroundColor: '#f4f4f4',
    color: '#333',
  }

  return (
    <div style={style}>
      <Header/>
      <Content/>
      <Footer/>
    </div>
  );
}
export default App;
