## Get Started

First you need to [download jube-2.0.48-image.zip](http://central.maven.org/maven2/io/fabric8/jube/images/jube/jube/2.0.48/jube-2.0.48-image.zip) and unzip it:

    curl -O http://central.maven.org/maven2/io/fabric8/jube/images/jube/jube/2.0.48/jube-2.0.48-image.zip
    mkdir jube-2.0.48-image
    cd jube-2.0.48-image
    unzip ../jube-2.0.48-image.zip

You can then startup Jube via:

    cd jube-2.0.48-image
    ./run.sh

If your operating system doesn't have the executable flag set on the run script; try

    chmod +x *.sh *.bat bin/*

To stop Jube hit **Ctrl-C**.

If you want to run Jube in the background you can run **./start.sh** then you can run **./stop.sh** to stop it or run **./status.sh** to see if its still running.

### Setting environment variables

The following environment variables are used by various [fabric8 tools](http://fabric8.io/v2/tools.html) such as the [fabric8 maven plugin](http://fabric8.io/v2/mavenPlugin.html), the [Forge Addons](http://fabric8.io/v2/forge.html) and the [fabric8 java libraries](javaLibraries.html):

    export KUBERNETES_MASTER=http://localhost:8585/
    export FABRIC8_CONSOLE=http://localhost:8585/hawtio/

Once you have set those in your shell (or ~/.bashrc) you can then use all the [fabric8 tools](http://fabric8.io/v2/tools.html) against your local Jube node.

### Using the web console

Once Jube has started up you should be able to open the web console at [http://localhost:8585/hawtio/](http://localhost:8585/hawtio/) to view the kubernetes system. You can then view these tabs:

 * [Pods tab](http://localhost:8585/hawtio/kubernetes/pods) views all the available [pods](pods.html) in your kubernetes environment
 * [Replication Controllers tab](http://localhost:8585/hawtio/kubernetes/replicationControllers) views all the available [replication controllers](replicationControllers.html) in your kubernetes environment
 * [Services tab](http://localhost:8585/hawtio/kubernetes/services) views all the available [services](services.html) in your kubernetes environment

Jube implements the [Kubernetes](http://kubernetes.io/) REST API so you can use any kubernetes tools with Jube such as the [Fabric8 Forge Addons](http://fabric8.io/v2/forge.html) to work with [pods](pods.html), [replication controllers](replicationControllers.html) or [services](services.html) - provided that any docker images referenced in the pods and pod templates have a suitable [image zip](http://fabric8.io/jube/imageZips.html). For more detail on this see the [Jube Goals](http://fabric8.io/jube/goals.html) details on [Jube Image Zips](http://fabric8.io/jube/imageZips.html) and check out the [differences between Jube and Kubernetes](http://fabric8.io/jube/differences.html)


