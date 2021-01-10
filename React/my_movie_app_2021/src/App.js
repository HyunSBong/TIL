import React from "react";
import axios from "axios";
import Movie from "./movie";

class App extends React.Component {
  state = {
    isLoading: true,
    movies: []
  };
  getMovies = async() => { // async 비동기식으로 변경 -> api가 모두 로드될 때까지 기다리기 위해
    const {
      data: {
        data: {movies}
      }
    } = await axios.get("https://yts-proxy.nomadcoders1.now.sh/list_movies.json?sort_by=rating");
    this.setState({movies, isLoading: false})
  };
  componentDidMount() {
    this.getMovies();
  }
  render() {
    // const {isLoading} = this.state;
    return (
      <div>
        {this.state.isLoading ? "Loading" : this.state.movies.map(movie => {
          console.log(movie);
          return (
          <Movie 
            key={movie.id}
            id={movie.id} 
            year={movie.year} 
            title={movie.title} 
            summary={movie.summary} 
            poster={movie.poster} />
          );
        })}
      </div>
    );
  }
}

 export default App;