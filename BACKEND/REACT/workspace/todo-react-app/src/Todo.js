// 나의 할일에 대한 1건 Todo.js


import { DeleteOutline } from "@mui/icons-material";
import { Checkbox, IconButton, InputBase, ListItem, ListItemSecondaryAction, ListItemText } from "@mui/material";
import { useState } from "react";

function Todo (props) {

    const [item,setItem] = useState(props.item);
    const [readOnly, setReadOnly] = useState(true);
    // InputBase 더블클릭 시 readOnly 해제
    const turnOffReadOnly = (e) => {
        setReadOnly(false);
    }
    // 수정 후 Enter 입력 시 readOnly 설정
    // enter 키를 할때만 값이 수정하도록 하기 
    const turnOnReadOnly = (e) => {
        if(e.key==='Enter'){
            setReadOnly(true);
            editItem(item);
        }
    }

    const editItem = props.editItem;
    const editEvent = (e) => {
        setItem({...item, title: e.target.value });
        // item.title = e.target.value;
        // editItem(item);
    }

    // 불필요한 랜더링을 막기 위해 setItem() 과 item. 으로 접근하는걸 적절히 사용할것
    const checkboxEvent = (e) => {
        // setItem({...item,done: e.target.checked});
        item.done = e.target.checked;
        editItem(item);
    }
    const deleteItem = props.deleteItem;
    const deleteEvent = () => {
        deleteItem(item);
    }
    // material-ui 적용 전
    // return (
    //     <div className="Todo">
    //         <input type="checkbox" id={item.id} name={item.id} checked={item.done} />
    //         <label id={item.id}>{item.title}</label>
    //     </div>
    // );

    return (
        <ListItem>
            <Checkbox checked={item.done} onChange={checkboxEvent} />
            <ListItemText>
                <InputBase 
                    inputProps={{"aria-label":"naked", "readOnly":readOnly}}
                    type="text"
                    onDoubleClick={turnOffReadOnly}
                    onKeyDown={turnOnReadOnly}
                    onChange={editEvent}
                    id={item.id}
                    name={item.id}
                    value={item.title}
                    multiline={true}
                    fullWidth={true}
                />
            </ListItemText>

            <ListItemSecondaryAction>
                <IconButton aria-label="할일 삭제" onClick={deleteEvent}>
                    <DeleteOutline />
                </IconButton>
            </ListItemSecondaryAction>
        </ListItem>
    );
}


export default Todo;