import './App.css';
import Viewer from './component/Viewer';
import Controller from './component/Controller';
import { useState } from 'react';

function App() {
  const [num,setNum] = useState(0);

  // 이전값을 가지고 들고가기 
  const handleSetNum = (value) => {
    setNum(num + value);
  }


  return (
    <div className="App">
      <h1>Simple Counter</h1>
      <section>
        <Viewer num={num}/>
      </section>
      <section>
        <Controller handleSetNum={handleSetNum}/>
      </section>
    </div>
  );
}

export default App;
