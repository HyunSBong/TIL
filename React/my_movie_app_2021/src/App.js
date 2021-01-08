import React from 'react';

function Food({fav}) { // react magic , props.fav == {fav}
  return <h3>I like {fav}</h3>
}

function App() { //prop = property
  return (
    <div>
      <h1>Hello!</h1>
      <Food fav="pizza"/>
    </div>
  );
}

export default App;