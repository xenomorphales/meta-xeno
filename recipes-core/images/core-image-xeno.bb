DESCRIPTION = "An image with packagegroup-ros-world installed"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL += " kernel-modules "

IMAGE_INSTALL += " packagegroup-ros2-world "
IMAGE_INSTALL += " opencv "
IMAGE_INSTALL += " networkmanager "
IMAGE_INSTALL += " openssh "

