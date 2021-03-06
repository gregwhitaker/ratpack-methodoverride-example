# ratpack-methodoverride-example
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-methodoverride-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-methodoverride-example)

An example of adding support for the `X-HTTP-METHOD-OVERRIDE` header in [Ratpack](https://ratpack.io).

The example contains a single endpoint at `PATCH /api/v1/dummy` that can be also be called using the `X-HTTP-METHOD-OVERRIDE` header on a `POST` request.

## Running the Example
1. Run the following command to start the application:

        ./gradlew run
        
2. Run the following command to call the `/api/v1/dummy` endpoint using the `PATCH` method:

        curl --request PATCH http://localhost:5050/api/v1/dummy
        
    If successful, you will see the following message:
    
        Dummy Endpoint!

3. Run the following command to call the `/api/v1/dummy` endpoint using the override `POST` method:

        curl -H "X-HTTP-METHOD-OVERRIDE: patch" -X POST http://localhost:5050/api/v1/dummy
        
    If successful, you will see the same message as before:
    
        Dummy Endpoint!

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-methodoverride-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.