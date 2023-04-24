# Reflections

## How can I ensure that my code, program, or software is functional and secure?

The first step would be to ensure that the specifications are clear. In some development models, a lot of the detailed specifications and design are left to the development team. In this case, while I might not receive detailed specifications, I would make sure that it is clear which unspecified areas were oversights, and which are deliberately left to my and my teams discretion. Poor specifications, no matter how well implemented, lead to a poor result. 

To be functional also means a good user interface. GIMP, for instance, has a powerful featureset but the user interface is often confusing, especially to newcomers and people not used to the quirks of open source software that largely began as hobby projects. I would look to existing applications and hardware tools in the problem domain and try to see what they do well and what they do poorly.  Security I would do the same.

I would, of course, also test thoroughly as discussed in this course, as well as test for common problems in the sort of software I'm developing.

## How do I interpret user needs and incorporate them into a program?

I focus on the problem domain, the actual problem the user is trying to solve with the software. An excessive focus on the features themselves may lead to something that can fullfill the users needs, but it might be so much of a hassle that they'd rather do it the old way or even not at all. This is another issue common to a lot of open source software- focus on useful features rather than the users that actually use the software. I'd basically constantly remind myself of who is to use the software, and prioritize their needs over mine.

## 

I start with a general idea, write up a simplified version and iterate on it. Essentially, I use an agile approach. One example is a program I wrote to compute the two value ackermann function. This function is mostly known for extremely deep recursion- in one of the branches, it makes a recursive call using another recursive call as an argument. This can lead to the straightforward implementation taking so much time, for small inputs such as 4, 3, that the universe would reach heat death before a result is returned. Even 4,2 can take days or weeks to return a result. I first wrote the straightforward version. Then I addeed extra base cases so that more values had an immediate response without the need for recursion. Further work added caching for larger inputs(lower inputs took longer to cache than to just directly compute). Finally I added support for the GMP library to work with larger integers, and I was able to return a result for 4,2 in less than a microsecond. I started with something that worked, made a modification, made sure that worked, and iterated on this until I was able to get the highest result my computer can store as quickly as possible.
