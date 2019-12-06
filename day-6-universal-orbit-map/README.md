# Day 6: Universal Orbit Map

## Part One
You've landed at the Universal Orbit Map facility on Mercury. Because navigation in space often involves transferring between orbits, the orbit maps here are useful for finding efficient routes between, for example, you and Santa. You download a map of the local orbits (your puzzle input).

Except for the universal Center of Mass (`COM`), every object in space is in orbit around exactly one other object.

What is the total number of direct and indirect orbits in your map data?


## Part Two

Now, you just need to figure out how many orbital transfers you (`YOU`) need to take to get to Santa (`SAN`).

You start at the object `YOU` are orbiting; your destination is the object `SAN` is orbiting. An orbital transfer lets you move from any object to an object orbiting or orbited by that object.

What is the minimum number of orbital transfers required to move from the object YOU are orbiting to the object `SAN` is orbiting? (Between the objects they are orbiting - not between `YOU` and `SAN`.)

## References
https://adventofcode.com/2019/day/4