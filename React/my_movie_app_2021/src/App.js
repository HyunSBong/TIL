import React from "react";

class App extends React.Component {
  state = {
    isLoading: true
  };
  componentDidMount() {
    setTimeout(() => {
      this.setState({isLoading: false});
    }, 6000);
  }
  render() {
    console.log("I'm rendering");
    return (
      <div>
        {this.state.isLoading ? "Loading" : "We are ready"}
      </div>
    );
  }
}

 export default App;