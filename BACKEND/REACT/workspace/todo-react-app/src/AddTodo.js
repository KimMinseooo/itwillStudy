import { Button, Grid, TextField } from "@mui/material";
import { useState } from "react";

function AddTodo (props) {
    // 사용자의 입력을 저장할 오브젝트
    const [item,setItem] = useState({title:""})
    const addItem = props.addItem; // App.js 에서 전달받은 addItem() 함수 저장
    const enterKeyEvent = (e) => {
        if(e.key === 'Enter') {
            onButtonClick(); // 버튼 클릭 함수 재사용  ,불필요한 코드 중복 최소화하기 
        }
    }
    const onButtonClick = () => {
        addItem(item);
        setItem({title: ""});
    }

    const onInputChange = (e) => {
        setItem({title : e.target.value});
    }

    return (
        <Grid container style={{marginTop:20}}>
            <Grid xs={11} md={11} item style={{paddingRight:16}}>
                <TextField 
                    placeholder="추가할 내용을 입력해주세요"
                    fullWidth
                    onChange={onInputChange}
                    onKeyDown={enterKeyEvent}
                    value={item.title}
                />
            </Grid>
            <Grid xs={1} md={1}>
                <Button
                fullWidth style={{height:'100%'}}
                color="secondary"
                variant="outlined"
                onClick={onButtonClick}>
                    +
                </Button>
            </Grid>
        </Grid>
    );
}

export default AddTodo;