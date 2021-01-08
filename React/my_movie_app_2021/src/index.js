import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

// <App /> 는 Component이며 HTML을 반환하는 함수
// React는 componet를 사용하여 HTML처럼 작성하려하는데 이를 JSX라고 함
// React Application은 한 번에 하나의 component만을 rendering할 수 있음

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);