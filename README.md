Welcome to the book-finder-app-base-2 wiki! The test for the Book search are written in android espresso. By passing BookListActivity into the activity rule. Incorporate the feature to expand the test as Suite (@Suite.SuiteClasses).

SearchTest is the class that consists of the method to that has test.

Run configuration settings:

In the module section,
*select App Under the test section, 
*select All in the module Under Specific instrumentation runner select :android.support.test.runner.AndroidJUnitRunner.


Commented out the dependencies for the spoon, if uncommented, then test will run across multiple devices and can generate report along with screenshots
