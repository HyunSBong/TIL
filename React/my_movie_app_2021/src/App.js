import React from "react";

class App extends React.Component {
  state = {
    count: 0
  };
  add = () => {
    this.setState(current => ({ count: current.count + 1 }));
    // current = this.state
    // react는 setState를 호출할 때마다 새로운 state와 함께 render function을 호출함
  };
  minus = () => {
    this.setState(current => ({ count: current.count - 1 }));
  };
  // Component Life Cycle
  /*
  실행 - Render Mount
  setState - Render Update
  페이지 나갈 때 - Will Umnount
  */
  componentDidMount() {
    console.log("Component rendered");
  }
  componentDidUpdate() {
    console.log("I just updated");
  }
  componentWillUnmount() {
    console.log("Goodbye");
  }

  render() {
    console.log("I'm rendering");
    return (
      <div>
        <h1>The number is: {this.state.count}</h1>
        <button onClick={this.add}>Add</button>
        <button onClick={this.minus}>Minus</button>
      </div>
    );
  }
}

 export default App;