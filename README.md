# meta-xeno

## install dependencies

This insallation have been tested on Ubuntu 18.04

For more information on the installation of Yocto, see it's 
[quick build doc](https://www.yoctoproject.org/docs/2.6.2/brief-yoctoprojectqs/brief-yoctoprojectqs.html)

First, install essential packages :

```sh
sudo apt install gawk wget git-core diffstat unzip texinfo gcc-multilib \
     build-essential chrpath socat cpio python python3 python3-pip python3-pexpect \
     xz-utils debianutils iputils-ping libsdl1.2-dev xterm
```

Create workspace :

```sh
mkdir yocto_ws
cd yocto_ws
```

Clone poky (thud) :

```sh
git clone -b thud --depth 1 git://git.yoctoproject.org/poky.git
```

Clone other meta-layers (thud) :

```sh
git clone -b thud git://git.yoctoproject.org/meta-raspberrypi
git clone -b thud git://git.openembedded.org/meta-openembedded
git clone -b thud git://git.openembedded.org/openembedded-core
git clone https://github.com/bmwcarit/meta-ros
```

Clone meta-xeno :

```sh
git clone https://github.com/xenomorphales/meta-xeno.git
```

## Configure build env

Still in the workspace directory :

```sh
. ./poky/oe-init-build-env
```

You should now be in the `yocto_ws/build` dir.

Add required layers :

```sh
bitbake-layers add-layer ../openembedded-core/meta
bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-openembedded/meta-python
bitbake-layers add-layer ../meta-openembedded/meta-multimedia
bitbake-layers add-layer ../meta-openembedded/meta-networking
bitbake-layers add-layer ../meta-ros
bitbake-layers add-layer ../meta-raspberrypi
bitbake-layers add-layer ../meta-xeno
```

## Build image

```sh
bitbake core-image-xeno
```
