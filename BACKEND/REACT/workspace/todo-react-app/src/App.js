import logo from './logo.svg';
import './App.css';
import Todo from './Todo';
import { useState } from 'react';
import { Container, List, Paper } from '@mui/material';
import AddTodo from './AddTodo';

function App() {

  const [items, setItems] = useState([])

  const addItem = (item) => {
    item.id ="ID-" +items.length; // key를 위한 id (pk)
    item.done = false; // 최초 할일 추가시 done값을 false
    setItems([...items,item]);   // 참조변수이기때문에 새로운값을 할당해 추가함 
    console.log(items);
  }
  const editItem =() => {}
  const deleteItem = (item) => {
    const newItems = items.filter( e => e.id !== item.id);  // 필터 후 리턴되는값을 새로운 배열로 만든다.
    setItems(newItems);
  }


  // let todoItems= items.length > 0 && items.map((item) =><Todo item={item} key={item.id}/>);
  let todoItems = items.length > 0 && (
    <Paper>
      <List>
        {items.map((item)=>(
          <Todo item={item} key={item.id} editItem={editItem} deleteItem={deleteItem}/>
        ))}
      </List>
    </Paper>
  )
  return (
    <div className="App">

      <Container maxWidth="md">
        <AddTodo addItem={addItem}/>
        <div className="TodoList">{todoItems}</div>
      </Container>

    </div>
  );
}

export default App;
