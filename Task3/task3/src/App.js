import React from 'react';
import PostForm from './components/PostForm';
import PostList from './components/PostsList'; 

const App = () => {
    return (
        <div>
            <h1>Post Management</h1>
            <PostForm />
            <PostList />
        </div>
    );
};

export default App;
