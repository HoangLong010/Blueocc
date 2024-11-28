import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { addPost } from '../redux/actions';

const PostForm = () => {
    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    const dispatch = useDispatch();

    const handleSubmit = (e) => {
        e.preventDefault();
        if (title && body) {
            const newPost = { title, body };
            dispatch(addPost(newPost));
            setTitle('');
            setBody('');
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <input
                type="text"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                placeholder="Title"
                required
            />
            <textarea
                value={body}
                onChange={(e) => setBody(e.target.value)}
                placeholder="Body"
                required
            />
            <button type="submit">Add Post</button>
        </form>
    );
};

export default PostForm;
