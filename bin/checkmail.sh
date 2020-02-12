#!/bin/sh

STATE=`nmcli networking connectivity`

if [ $STATE = 'full' ]
then
    mbsync -qq smarttra
    exit 0
fi
echo "No internet connection."
exit 0
