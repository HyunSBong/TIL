import React from "react";
import axios from "axios";

class App extends React.Component {
  state = {
    isLoading: true,
    movies: []
  };
  getMovies = async() => { // async 비동기식으로 변경 -> api가 모두 로드될 때까지 기다리기 위해
    const movies = axios.get("https://yts-proxy.nomadcoders1.now.sh/list_movies.json ");
  }
  componentDidMount() {
    this.getMovies();
  }
  render() {
    // const {isLoading} = this.state;
    return (
      <div>
        {this.state.isLoading ? "Loading" : "We are ready"}
      </div>
    );
  }
}

 export default App;